package aluno;

public class App {
    public static void main(String[] args) {
        AlunoFundamental af = new AlunoFundamental(01, "joaozinho", 10.00, 10.00, 10.00, 10.00);
        AlunoGraduacao ag = new AlunoGraduacao(02, "joao", 6.00, 5.00);
        AlunoPos ap = new AlunoPos(03, "joaozao", 8.00, 7.00, 6.50);

        af.calcularMedia();
        ag.calcularMedia();
        ap.calcularMedia();

        System.out.println(af);
        System.out.println(ag);
        System.out.println(ap);
    }
}