package aluno;

public class AlunoGraduacao extends Aluno {
    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(Integer ra, String name, Double nota1, Double nota2) {
        super(ra, name);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public Double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String toString() {
        return String.format("Aluno Graduação %s, notas: %.2f, %.2f e Média final = %.2f",
                super.getNome(),nota1, nota2, calcularMedia().toString());
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
}