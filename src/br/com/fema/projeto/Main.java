package br.com.fema.projeto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;

import br.com.fema.projeto.json.JsonService;
import br.com.fema.projeto.model.Cidade;
import br.com.fema.projeto.model.Estado;

/**
 * 
 * @author Lucas Assis, Matheus Gustavo
 *
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        JsonService service = new JsonService();

        Estado sp = new Estado("São Paulo", "SP");
        Cidade assis = new Cidade("Assis", sp, 100_000, LocalDate.of(1917, 12, 20), LocalDateTime.now());
        Cidade bauru = new Cidade("Bauru", sp, 379_297, LocalDate.of(1896, 8, 1), LocalDateTime.now());
        
        sp.setCidadeSet(new HashSet<Cidade>(Arrays.asList(assis, bauru)));
        sp.setCidadeList(Arrays.asList(assis, bauru));
        
        System.out.println(service.montaJSON(assis));
        System.out.println(service.montaJSON(bauru));
        System.out.println(service.montaJSON(sp));
    }
}
