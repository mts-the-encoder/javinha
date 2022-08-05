package aluno;

public class AlunoPos extends Aluno {
    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    public AlunoPos(Integer ra, String name, Double nota1, Double nota2, Double notaMonografia) {
        super(ra, name);
        if(nota1 < 0 || nota2 < 0 || notaMonografia < 0){
            System.out.println("Nota deve ser maior que 0");
        } else {
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.notaMonografia = notaMonografia;
        }
    }

    @Override
    public Double calcularMedia() {
        return (nota1 + nota2 + notaMonografia) / 3;
    }

    @Override
    public String toString() {
        return String.format("Aluno-Pós %S:  notas: %.2f, %.2f, %.2f (Monografia), Média = %.2f",
                super.getNome(),nota1, nota2, notaMonografia, calcularMedia());
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

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }
}