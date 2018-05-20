/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author Wojciech
 */
import java.util.HashMap;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        HashMap<String, String> mymap = inicjujMape();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj polskie słowo:");
            String slowo = scanner.next();

            if (slowo.equals("koniec!")) {
                break;
            }

            String tlumaczenie = mymap.get(slowo);
            if (tlumaczenie != null && !tlumaczenie.isEmpty()) {
                System.out.println(tlumaczenie);
            } else {
                System.out.println("Słownik nie zawiera tłumaczenia!");
            }

        }
    }

    private static HashMap<String, String> inicjujMape() {
        HashMap<String, String> mymap = new HashMap<String, String>();
        mymap.put("matka", "mother");
        mymap.put("pies", "dog");
        mymap.put("kot", "cat");
        mymap.put("pająk", "spider");
        mymap.put("koń", "horse");
        mymap.put("kiełbasa", "sausage");
        mymap.put("ojciec", "father");
        mymap.put("papier", "paper");
        mymap.put("babcia", "grandmather");
        mymap.put("dziadek", "grandfather");
        mymap.put("siostra", "sister");
        mymap.put("brat", "brother");
        mymap.put("słońce", "sun");
        mymap.put("pióro", "pen");
        mymap.put("banan", "banana");
        mymap.put("rzeka", "river");

        return mymap;

    }
}
