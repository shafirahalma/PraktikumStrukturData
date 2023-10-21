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
public class HashChainApp {

    public static void main(String[] args) {
        int size = 15;
        HashTable h = new HashTable(size);
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

//    h.insert(18);
//    h.insert(26);
//    h.insert(28);
//    h.insert(36);
//    h.insert(10);
        h.displayTable();
    }
}
