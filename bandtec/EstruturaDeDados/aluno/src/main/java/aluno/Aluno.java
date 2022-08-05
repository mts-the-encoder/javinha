package aluno;

public abstract class Aluno {
    private Integer ra;
    private String nome;

    public Aluno(Integer ra, String name) {
        this.ra = ra;
        this.nome = name;
    }

    public abstract Double calcularMedia();

    @Override
    public String toString() {
        return String.format("Aluno: %s, ra: %d", nome, ra);
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
