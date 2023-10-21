package Modul2_Pendahuluan;

import Modul2_Pendahuluan.HighArray1;

/**
 *
 * @author LAB PROGRAMMING 1
 */
public class HighArrayApp1 {

    public static void main(String[] args) {
        int maxSize = 100;
        HighArray1 arr;
        arr = new HighArray1(maxSize);

        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
//        arr.insert(30);
//        arr.insert(00);
//        arr.insert(90);
//        arr.insert(40);

//        System.out.println("Array yang sebelum diurutkan :");
//        arr.display();
//        System.out.println("Array yang sesudah diurutkan :");
//        arr.BubbleSort();
//          System.out.println("Tampilan isi elemen pada array setelah kode pertukaran :");
//          arr.SelectionSort();
        arr.InsertionSort();
//        arr.display();

//        arr.display();
//        int key = 25;
//        if (arr.find(key)) {
//            System.out.println(key +
//                      " ditemukan");
//        } else {
//            System.out.println(key +
//                      " tidak ditemukan");
//        }
//
// arr.delete(00);
// arr.delete(80);
// arr.delete(55);
    }

}
