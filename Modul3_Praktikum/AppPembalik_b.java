package Modul3_Praktikum;

import java.util.Scanner;

/**
 *
 * @author shafira halmahera
 */
public class AppPembalik_b {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan kata : ");
            String input = scan.next();
            String output;
            Pembalik pembalik = new Pembalik(input);
            output = pembalik.membalik();
            System.out.println("Kebalikan : " + output);
        }
    }

}
