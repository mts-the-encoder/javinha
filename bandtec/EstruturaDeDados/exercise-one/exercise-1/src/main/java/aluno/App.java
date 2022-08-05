package aluno;

public class App {
    public static void main(String[] args) {
        AlunoFundamental af = new AlunoFundamental(01, "joaozinho", 10.00, 10.00, 10.00, 10.00);
        AlunoGraduacao ag = new AlunoGraduacao(02, "joao", 6.00, 5.00);
        AlunoPos ap = new AlunoPos(03, "joaozao", 8.00, 7.00, 6.50);
        Escola school = new Escola("BandTec");

        af.calcularMedia();
        ag.calcularMedia();
        ap.calcularMedia();

        school.addAluno(ag);
        school.addAluno(af);
        school.addAluno(ap);


        school.buscaAluno(00);
        school.buscaAluno(01);
    }
}