public class PetShop {

    private String nome;
    private Double faturamento;

    public PetShop(String nome, Double faturamento) {
        this.nome = nome;
        this.faturamento = faturamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    public void darBanho(Pet pet, Double valor, Integer desconto) {
        valor -= desconto;
        this.faturamento += valor;
        System.out.println(String.format("o cachorro %s tomou banho e valor foi: R$ %.1f, isso com um " +
                "desconto de %d", pet.getNome(), valor, desconto));
    }

    @Override
    public String toString() {
        return String.format("PEtShOp %s tem um faturamento de R$ %.1f", nome, faturamento);
    }
}
