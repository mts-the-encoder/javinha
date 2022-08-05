package aluno;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Aluno> students;

    public Escola(String nome) {
        this.nome = nome;
        students = new ArrayList<Aluno>();
    }

    public void addAluno(Aluno student){
        students.add(student);
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
            if(student.getRa().equals(ra)){
                System.out.println(student);
            }
            if(students.contains(ra)){
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