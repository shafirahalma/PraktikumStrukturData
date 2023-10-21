/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6_Pendahuluan;

/**
 *
 * @author shafira halmahera
 */
public class QuickSortApp {

    private int[] arr;
    private int nElemen;

    public QuickSortApp(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void QuickSort() {
        recQuickSort(0, nElemen - 1);
    }

    public void recQuickSort(int batasKiri, int batasKanan) {
        if (batasKanan - batasKiri <= 0) {
            return;
        } else {
            int pivot = arr[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi - 1);
            recQuickSort(partisi + 1, batasKanan);

        }
    }
//membagi dan penentuan pivot
    public int partitionIt(int batasKiri, int batasKanan, int pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan + 1;
        while (true) {
            while (indexKiri < batasKanan && arr[++indexKiri] < pivot);
            while (indexKanan > batasKiri && arr[--indexKanan] > pivot);
            if (indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);
                display();
            }
        }
        return indexKiri;
    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public int size() {
        return nElemen;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int maxSize = 100;
        QuickSortApp arr;
        arr = new QuickSortApp(maxSize);

        arr.insert(1);
        arr.insert(3);
        arr.insert(5);
        arr.insert(7);
        arr.insert(2);
        arr.insert(4);
        arr.insert(6);
        arr.insert(8);

        System.out.println("Sebelum di sorting : ");
        arr.display();

        System.out.println(" ");
        System.out.println("Quick Sort : ");
        arr.QuickSort();
        arr.display();

    }

}
