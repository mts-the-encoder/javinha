package aluno;

public class AlunoGraduacao extends Aluno {
    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(Integer ra, String name, Double nota1, Double nota2) {
        super(ra, name);
        if(nota1 < 0 || nota2 < 0){
            System.out.println("Nota deve ser maior que 0");
        } else {
            this.nota1 = nota1;
            this.nota2 = nota2;
        }
    }

    @Override
    public Double calcularMedia() {
        return (nota1 * 0.4) + (nota2 * 0.6);
    }

    @Override
    public String toString() {
        return String.format("Aluno Graduação %s, notas: %.2f, %.2f e Média final = %.2f",
                super.getNome(),nota1, nota2, calcularMedia());
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