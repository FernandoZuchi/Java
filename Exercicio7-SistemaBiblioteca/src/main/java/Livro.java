public class Livro extends MaterialBiblioteca{

    public Livro(String titulo, int diaPublicacao, int mesPublicacao, int anoPublicacao) {
        super(titulo, diaPublicacao, mesPublicacao, anoPublicacao);
    }

    @Override
    public String calcularDataDevolucao() {
        // Supomos que o prazo de devolução seja de 15 dias
        int prazoDevolucao = 15;
        return calcularDataDevolucaoBase(prazoDevolucao);
    }

    private String calcularDataDevolucaoBase(int prazoDevolucao) {
        int diaDevolucao = diaPublicacao + prazoDevolucao;
        int mesDevolucao = mesPublicacao;
        int anoDevolucao = anoPublicacao;

        // Ajusta a data de devolução se passar para o mês seguinte
        if (diaDevolucao > 30) {
            diaDevolucao -= 30;
            mesDevolucao++;
            if (mesDevolucao > 12) {
                mesDevolucao -= 12;
                anoDevolucao++;
            }
        }

        return diaDevolucao + "/" + mesDevolucao + "/" + anoDevolucao;
    }
}
