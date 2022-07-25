public class TestePokemon {

    public static void main(String[] args) {

        Pokemon poke1 = new Pokemon("Bulbasaur","grama", 30, 3);
        Pokemon poke2 = new Pokemon("Charmander","fogo", 30, 5);
        TreinadorPokemon mts = new TreinadorPokemon("matheus n");

        for(int i = 0; i < 5; i++){
            mts.treinarPokemon(poke1);
        }
        System.out.println(poke1.toString());
        mts.evoluirPokemon(poke1, "Ivysaur");
        System.out.println(poke1.toString());

        for(int i =0; i < 2; i++){
            mts.treinarPokemon(poke2);
        }
        System.out.println(poke2.toString());
        mts.evoluirPokemon(poke2, "Charmeleon");

        System.out.println(mts.toString());
    }
}
