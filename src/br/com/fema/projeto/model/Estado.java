package br.com.fema.projeto.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.fema.projeto.json.annotations.JsonIgnore;

public class Estado {

    private String nome;
    @JsonIgnore()
    private String sigla;
    private List<Cidade> cidadeList = new ArrayList<Cidade>();
    private Set<Cidade> cidadeSet = new HashSet<Cidade>();

    public Estado() {
    	this.cidadeSet = new HashSet<Cidade>();    	
    }

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.cidadeSet = new HashSet<Cidade>();
        this.cidadeList = new ArrayList<Cidade>();
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<Cidade> getCidadeList() {
		return cidadeList;
	}

	public void setCidadeList(List<Cidade> cidadeList) {
		this.cidadeList = cidadeList;
	}

	public Set<Cidade> getCidadeSet() {
		return cidadeSet;
	}

	public void setCidadeSet(Set<Cidade> cidadeSet) {
		this.cidadeSet = cidadeSet;
	}
}
