package main.java;

public class Coordenacao {

    private Pessoa pessoa;
    private Curso curso;
    private String areaCoordenacao;

    public Coordenacao(String nome, Escolaridade escolaridade, Cidade cidade, Curso curso, String areaCoordenacao) {
        this.pessoa = new Pessoa(nome, escolaridade, cidade);
        this.curso = curso;
        this.areaCoordenacao = areaCoordenacao;
    }

    public String getEscolaridadeCoordenador() {
        return pessoa.getEscolaridade().getNivel();
    }

      public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

     public String getAreaCoordenacao() {
        return areaCoordenacao;
    }

    public void setAreaCoordenacao(String areaCoordenacao) {
        this.areaCoordenacao = areaCoordenacao;
    }
}
