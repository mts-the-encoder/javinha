package aluno;

import java.util.List;

public class Escola {
    private String nome;
    private List<Aluno> students;

    public Escola(String nome, List<Aluno> students) {
        this.nome = nome;
        this.students = students;
    }

    public void addAluno(Aluno student){
        students.add(student);
        System.out.println(String.format("Adicionando o aluno %s", getNome()));
    }

    public void exibeTodos(){
        for (Aluno student : students) {
            System.out.println(student);
        }
    }

    public void exibeAlunosGraduacao(){
        for (Aluno student : students) {
            if(student instanceof AlunoGraduacao){
                System.out.println(student);
            }
        }
    }

    public void exibeAprovados(){
        for (Aluno student : students) {
            if(student.calcularMedia() >= 6){
                System.out.println("Aprovados: \n" + student);
            }
        }
    }

    public void buscaAluno(Integer ra){
        for (Aluno student : students) {
            if(ra.equals(student.getRa())){
                System.out.println(student);
            }
            else {
                System.out.println("Aluno não encontrado");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getStudents() {
        return students;
    }
}