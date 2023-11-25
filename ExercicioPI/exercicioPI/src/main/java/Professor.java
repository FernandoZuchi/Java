package main.java;

public class Professor extends Pessoa {
    
    private Curso curso;
    private String disciplina;

    public Professor(String nome, Escolaridade escolaridade, Cidade cidade, Curso curso, String disciplina)
    {
        super(nome, escolaridade, cidade);
        this.curso = curso;
        this.disciplina = disciplina;
    }

    public String getEscolaridadeProfessor()
    {
        return getEscolaridade().getNivel();
    }

    public Curso getCurso()
    {
        return curso;
    }

    public void setCurso(Curso curso)
    {
        this.curso = curso;
    }

     public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}
