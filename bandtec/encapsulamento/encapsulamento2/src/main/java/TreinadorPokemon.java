public class TreinadorPokemon {

    private String nome;
    private Integer nivel;

    public TreinadorPokemon(String nome) {
        this.nome = nome;
        this.nivel = 0;
    }

    public void treinarPokemon(Pokemon pokemon) {
        Double frc = pokemon.getForca();
        Integer doce = pokemon.getDoces();

        pokemon.setForca(frc += frc * 0.10);
        pokemon.setDoces(doce + 10);
        this.nivel += 2;
    }

    public void evoluirPokemon(Pokemon pokemon, String evolucao) {
        String novoNome = pokemon.getNome();
        Integer doce = pokemon.getDoces();

        if (doce >= 50) {
            pokemon.setNome(evolucao);
            pokemon.setDoces(-50);
            nivel += 10;
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", nome, novoNome));
        } else {
            System.out.println("Não foi possível realizar operação");
        }

    }
    @Override
    public String toString() {
        String status = String.format("Treinador: %s, nivel %d .",
                this.nome,
                this.nivel
        );
        return status;
    }

}
