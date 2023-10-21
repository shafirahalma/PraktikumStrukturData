package Modul8_Praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author shafira halmahera
 */
public class HashTableApp {

    public static void main(String[] args) throws IOException {

        //pembuatan hashtable dgn ukuran 15
        HashTable h = new HashTable(15);
        int value;

        while (true) {
            System.out.print("Enter first letter of show, " + "insert, find, delete,: ");
            int choice = getChar();
            switch (choice) {
                case 'i':
                    System.out.print("Enter value and data to" + " insert: ");
                    value = getInt();
                    h.insert(value);
                    break;
                case 's':
                    h.displayTable();
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Data found = h.find(value);
                    if (found != null) {
                        System.out.print("found :");//Data ditemukan
                        found.displaydata();
                        System.out.println("");
                    } else {
                        System.out.println("could not find" + value);
                    }
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    Data DidDelete = h.delete(value);
                    System.out.println("Deleted " + value);
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
