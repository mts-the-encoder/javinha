public class Pokemon {

    private String nome;
    private String tipo;
    private double forca;
    private Integer doces = 0;

    public Pokemon(String nome, String tipo, Integer forca, Integer doces) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doces = doces;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }

    @Override
    public String toString() {
        String poke = String.format("Pokemon: %s\n Tipo: %s\n Força: %.2f\n Doces: %d\n",
                this.nome,
                this.tipo,
                this.forca,
                this.doces
        );
        return poke;
    }
}
