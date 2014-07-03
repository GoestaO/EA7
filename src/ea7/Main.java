/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea7;

/**
 *
 * @author goesta
 */
public class Main {

    public static void main(String[] args) {
        java.util.Map<String, Integer> m = new java.util.HashMap<String, Integer>();
        String s = "Hallo";
        int x = 10;
        m.put(s, x);
        m.put(s + s, x + x);
        m.put(s, m.get(s + s));
        int y = m.get(s);
        x = m.size();
        System.out.println("y = " + y);
        System.out.println("x = " + x);

    }
}
