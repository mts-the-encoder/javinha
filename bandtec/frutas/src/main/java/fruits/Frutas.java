package fruits;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class Frutas {

    public List listaFruits() {

        List<String> fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("laranja");
        fruits.add("bergamota");
        fruits.add("abacaxi");
        fruits.add("uva");
        fruits.add("melancia");
        return fruits;
    }

    public static String standards(String fruit) {
        return Normalizer.normalize(fruit, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]",
                "");
    }
}
