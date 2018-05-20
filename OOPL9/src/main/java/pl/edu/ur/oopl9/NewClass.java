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
import java.util.ArrayList;
import java.util.TreeSet;

public class NewClass {

    public static void main(String[] args) {

        TreeSet drzewo2 = new TreeSet<>();

        ArrayList<Samochód> samochody = new ArrayList<>();
        Samochód s1 = new Samochód();
        s1.setCena(10000);
        s1.setMarka("Opel");
        s1.setNazwaSam("Astra");
        s1.setPredkosc(220);
        samochody.add(s1);

        Samochód s2 = new Samochód();
        s2.setCena(15000);
        s2.setMarka("Opel");
        s2.setNazwaSam("Insignia");
        s2.setPredkosc(270);
        samochody.add(s2);

        Samochód s3 = new Samochód();
        s3.setCena(3000);
        s3.setMarka("Rover");
        s3.setNazwaSam("220");
        s3.setPredkosc(220);
        samochody.add(s3);

        samochody.get(0).getPredkosc();
        samochody.get(0).getCena();
        samochody.get(0).getNazwaSam();
        samochody.get(0).getMarka();
    }

}
