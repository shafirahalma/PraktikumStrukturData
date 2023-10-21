/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_Pendahuluan;

/**
 *
 * @author shafira halmahera
 */
public class HeapApp {

    public static void main(String[] args) {
        Heap h = new Heap(35);

        h.insert(12);
        h.insert(11);
        h.insert(8);
        h.insert(7);
        h.insert(10);
        h.insert(6);
        h.insert(5);
        h.insert(2);
        h.insert(4);
        h.insert(3);
        h.insert(9);
        h.insert(1);
      
        System.out.println("Sebelum insert : ");
        h.displayHeap();

        h.insert(50);

//      h.displayArray();
//      System.out.println("Sebelum penghapusan : ");
        System.out.println("Sesudah insert : ");
        h.displayHeap();
//      System.out.println("");
//      h.change(4, 2);
//      System.out.println("Sesudah penghapusan : ");
//      h.remove(12);
//      h.displayHeap();

    }
}
