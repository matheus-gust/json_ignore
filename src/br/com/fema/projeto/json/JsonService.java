package br.com.fema.projeto.json;

import br.com.fema.projeto.json.annotations.JsonIgnore;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonService {

    public String montaJSON(Object obj, Field... fieldsIgnore) throws IllegalArgumentException, IllegalAccessException {

        Class<?> classe = obj.getClass();

        List<String> jsonList = new ArrayList<>();

        List<Field> fields = this.retornaFieldsValidos(classe, fieldsIgnore);

        for(Field field : fields) {
            field.setAccessible(true);
            jsonList.add(retornaValor(field, obj));
        }

        String json = "{" + String.join(",", jsonList) + "}";

        return json;
    }


    private String retornaValor(Field field, Object obj) throws IllegalAccessException {
        String json = "\""+ field.getName() + "\":";
        if (field.getType() == Double.class || field.getType() == Float.class || field.getType() == Long.class ||
        field.getType() == Integer.class || field.getType() == Short.class || field.getType() == Character.class ||
        field.getType() == Byte.class || field.getType() == Boolean.class) {
            json += field.get(obj);
        } else if(field.get(obj) instanceof String) {
            json += "\"" + field.get(obj) + "\"";
        } else {
            json += montaJSON(field.get(obj), this.retornaFieldsIgnore(field));
        }

        //Lembrar de validar data, lista e identar
        //Criar json Ignore e Expande
        return json;
    }

    private List<Field> retornaFieldsValidos(Class<?> classe, Field... fieldsIgnore) {
        Field[] fields = classe.getDeclaredFields();

        List<Field> listFieldsValidos = new ArrayList<>();
        List<Field> listFieldsIgnore = Arrays.asList(fieldsIgnore);
        for(Field field : fields) {
            if(listFieldsIgnore.stream().filter(fieldIgnore -> field.getName().equals(fieldIgnore.getName())).findFirst().isPresent()) {
                continue;
            }

            JsonIgnore jsonIgnore = field.getDeclaredAnnotation(JsonIgnore.class);
            if(Objects.isNull(jsonIgnore)) {
                listFieldsValidos.add(field);
                continue;
            }

            if(jsonIgnore.ignore().length > 0) {
                listFieldsValidos.add(field);
            }
        }

        return listFieldsValidos;
    }

    public Field[] retornaFieldsIgnore(Field field) {
        JsonIgnore jsonIgnore = field.getAnnotation(JsonIgnore.class);
        if(Objects.isNull(jsonIgnore.ignore()))
            return new Field[] {};
        List<String> listJsonIgnore = Arrays.asList(jsonIgnore.ignore());;

        List<Field> listField = Arrays.asList(field.getType().getDeclaredFields()).stream().filter(fieldFilho -> {
            return listJsonIgnore.contains(fieldFilho.getName());
        }).collect(Collectors.toList());

        return listField.toArray(new Field[listField.size()]);
    }
}
