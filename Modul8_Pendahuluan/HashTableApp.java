/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8_Pendahuluan;

/**
 *
 * @author shafira halmahera
 */
public class HashTableApp {

    public static void main(String[] args) {
        HashTables h = new HashTables(15);
        h.insert(10);
        h.insert(10);
        h.insert(10);
        h.insert(13);
        h.insert(18);
        h.insert(15);
        h.insert(11);
        h.insert(19);
        h.insert(17);
        h.insert(12);

         h.displayTable();
        h.insert(18);
        h.insert(26);
        h.insert(28);
        h.insert(36);
        h.insert(10);

        h.delete(26); // delete nomor 5
        h.displayTable();
        int key = 26; // find nomor 4
        if (h.delete(key) != null) {
            System.out.println(key + " ketemu");
        } else {
            System.out.println(key + " tidak ketemu");
        }

    }
}
