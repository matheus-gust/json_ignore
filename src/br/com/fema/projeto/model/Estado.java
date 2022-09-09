package br.com.fema.projeto.model;

public class Estado {

    private String nome;
    private String sigla;
    //private List<Cidade> cidadeList = new ArrayList<>();

    Estado() {}

    public Estado(String nome, String sigla /*List<Cidade> cidadeList*/) {
        this.nome = nome;
        this.sigla = sigla;
        //this.cidadeList = cidadeList;
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

    /*public List<Cidade> getCidadeList() {
        return cidadeList;
    }

    public void setCidadeList(List<Cidade> cidadeList) {
        this.cidadeList = cidadeList;
    }*/
}
