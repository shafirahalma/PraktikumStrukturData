/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6_Praktikum;

/**
 *
 * @author shafira halmahera
 */
public class DataArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650280, "Arina", "Malang");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650260, "Helmi", "Madura");

        System.out.println("Data Sebelum di Sorting : ");
        System.out.println("=========================");
        arr.displayArray();

        System.out.println("Merge Sort Sorting berdasarkan Nama :");
        System.out.println("=====================================");
        arr.mergeSort();
        arr.displayArray();

        System.out.println("Shell Sort Sorting berdasarkan NIM :");
        System.out.println("====================================");
        arr.ShellSort();
        arr.displayArray();

        System.out.println("Quick Sort berdasarkan Nama :");
        System.out.println("=============================");
        arr.QuickSort();
        arr.displayArray();
    }
}

//public class SelectionSort {
//
//    public static void main(String[] args) {
//        int[] data = {6, 13, 1, 2, 8};
//        System.out.println("Sebelum Proses Sorting...");
//        tampil(data);
//        SelectionSort.sort(data);
//        System.out.println("Sesudah Sorting...");
//        tampil(data);
//    }
//
//    static void tampil(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    private static void sort(int[] data) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//}
