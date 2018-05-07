/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class Zad2 {

    public static void main(String[] args) {

        int a;
        
        Random losujLiczby = new Random();

        TreeSet c = new TreeSet<>();

        for (int i = 0; i < 100; i++) {
            a = losujLiczby.nextInt(101);
            c.add(a);
        }

        Iterator iter = c.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }

    }

}
