/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9_Praktikum;

/**
 *
 * @author shafira halmahera
 */
public class HeapApp {

    public static void main(String[] args) {
        int maxSize = 12;
        Heap h = new Heap(maxSize);

        for (int i = 0; i < maxSize; i++) {
            int value = (int) (Math.random() * 100);
            h.insertAt(i, value);
        }
        System.out.println("Sebelum urut : ");
        System.out.println("");
        h.displayHeap();
        
        System.out.println("");
        System.out.println("Setelah urut: ");
        h.HeapSort();
        h.displayArray();

    }
}
