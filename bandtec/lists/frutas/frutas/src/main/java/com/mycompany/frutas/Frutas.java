/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frutas;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author mnsantos4
 */
public class Frutas {

    public List listFruits() {
        List<String> fruits = new ArrayList();

        fruits.add("banana");
        fruits.add("laranja");
        fruits.add("bergamota");
        fruits.add("abacaxi");
        fruits.add("uva");
        fruits.add("melancia");
        return fruits;
    }

    public static String standard(String fruit) {
        return Normalizer.normalize(fruit, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]",
                "");
    }
}
