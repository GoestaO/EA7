/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a73;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author goesta
 */
public class Main {

    public static void main(String[] args) {

        DateiSortierer ds = new DateiSortierer();
        String name = "/home/goesta/test2.txt";
        StringListe l;

        ds.sortiereDatei(name);
//        System.out.println("l2 = " + l2);

    }
}
