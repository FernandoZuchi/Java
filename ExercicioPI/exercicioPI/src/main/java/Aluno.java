package main.java;

public class Aluno extends Pessoa {

    private Curso curso;

    public Aluno(String nome, Escolaridade escolaridade, Cidade cidade, Curso curso) {
        super(nome, escolaridade, cidade);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
