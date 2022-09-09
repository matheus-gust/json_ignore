package br.com.fema.projeto;

import br.com.fema.projeto.json.JsonService;
import br.com.fema.projeto.model.Cidade;
import br.com.fema.projeto.model.Estado;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        JsonService service = new JsonService();

        Estado estado = new Estado("São Paulo", "SP");
        Cidade cidade = new Cidade("Assis", estado, 100_000);

        System.out.println(service.montaJSON(cidade));
    }
}
