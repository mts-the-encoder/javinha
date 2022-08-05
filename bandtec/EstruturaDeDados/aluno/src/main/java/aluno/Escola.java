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

    }

    public void exibeTodos(){

    }

    public void exibeAlunosGraduacao(){

    }

    public void exibeReprovados(){

    }

    public void buscaAluno(){

    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getStudents() {
        return students;
    }
}
