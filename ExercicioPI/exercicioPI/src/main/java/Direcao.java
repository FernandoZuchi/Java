package main.java;

public class Direcao {

    private Pessoa diretor;

    public Direcao(String nomeDiretor, Escolaridade escolaridadeDiretor, Cidade cidadeDiretor, Curso curso) {
        this.diretor = new Pessoa(nomeDiretor, escolaridadeDiretor, cidadeDiretor);
    }

    public Pessoa getDiretor() {
        return diretor;
    }

    public void setDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }

    public String getEscolaridadeDiretor() {
        return diretor.getEscolaridade().getNivel();
    }
}
