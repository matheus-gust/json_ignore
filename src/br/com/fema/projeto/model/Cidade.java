package br.com.fema.projeto.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.fema.projeto.json.annotations.JsonIgnore;

public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
    @JsonIgnore(ignore = {"cidadeList", "cidadeSet"})
    private Estado estado;
    private Integer numeroHabitantes;
    private LocalDate fundacaoCidade;
    private LocalDateTime dataHoraAgora;

    public Cidade() {}
    
	public Cidade(String nome, Estado estado, Integer numeroHabitantes, LocalDate fundacaoCidade,
			LocalDateTime dataHoraAgora) {
		this.nome = nome;
		this.estado = estado;
		this.numeroHabitantes = numeroHabitantes;
		this.fundacaoCidade = fundacaoCidade;
		this.dataHoraAgora = dataHoraAgora;
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

	public LocalDate getFundacaoCidade() {
		return fundacaoCidade;
	}

	public void setFundacaoCidade(LocalDate fundacaoCidade) {
		this.fundacaoCidade = fundacaoCidade;
	}

	public LocalDateTime getDataHoraAgora() {
		return dataHoraAgora;
	}

	public void setDataHoraAgora(LocalDateTime dataHoraAgora) {
		this.dataHoraAgora = dataHoraAgora;
	}
}
