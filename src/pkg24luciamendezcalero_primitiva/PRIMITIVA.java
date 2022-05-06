/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg24luciamendezcalero_primitiva;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lucia
 */
public class PRIMITIVA {

    public int number, complement, repayment;

    ArrayList<Integer> carton = new ArrayList(7);
    Random rnd = new Random();

    public ArrayList<Integer> generarNumeros() {
        carton.clear();
        for (int i = 0; i < 6; i++) {
            int numero = rnd.nextInt(1, 49);
            if (carton.contains(numero)) {
                i -= 1;
            } else {
                carton.add(numero);
            }

        }
        return carton;
    }

    public int ComAndRein() {
        Random rnd = new Random();
        int numer = rnd.nextInt(0, 9);
        return numer;

    }
}
