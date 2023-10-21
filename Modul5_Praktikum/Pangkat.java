/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_Praktikum;

/**
 *
 * @author shafira halmahera
 */
public class Pangkat {

    public static void main(String[] args) {
        System.out.println("2^10 = " + hitungEksponen(2, 10));
        System.out.println("3^5 = " + hitungEksponen(3, 5));
        System.out.println("3^16 = " + hitungEksponen(3, 16));
    }

    public static int hitungEksponen(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * hitungEksponen(base, exponent - 1);
        }
    }
}
