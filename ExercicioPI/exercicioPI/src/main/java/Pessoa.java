package main.java;
public class Pessoa {
    
    private String nome;
    private Escolaridade escolaridade;
    private Cidade cidade;

    public Pessoa(String nome, Escolaridade escolaridade, Cidade cidade)
    {
        this.escolaridade = escolaridade;
        this.cidade = cidade;
        this.nome = nome;
    }
    
    public Escolaridade getEscolaridade()
    {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cidade getCidade()
    {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
