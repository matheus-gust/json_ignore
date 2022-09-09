package br.com.fema.projeto.model;

import br.com.fema.projeto.json.annotations.JsonIgnore;

public class Cidade {

    @JsonIgnore
    private String nome;
    @JsonIgnore(ignore = {"sigla"})
    private Estado estado;
    private Integer numeroHabitantes;

    Cidade() {}

    public Cidade(String nome, Estado estado, Integer numeroHabitantes) {
        this.nome = nome;
        this.estado = estado;
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(Integer numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
}
