public class Aluno {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 120) {
            this.idade = idade;
            System.out.println("Idade cadastrada");
        } else {
            System.out.println("erro! idade inválida");
        }

    }
}
