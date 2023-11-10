package exerciciosurpresa4;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor("João", LocalDate.of(1975, 3, 15), "Matemática");

        System.out.println("Nome do Professor: " + professor.getNome());
        System.out.println("Data de Nascimento: " + professor.getDataNascimento());
        System.out.println("Área de Atuação: " + professor.getArea());

        professor.setArea("Física");
        System.out.println("Nova Área de Atuação: " + professor.getArea());
    }
}