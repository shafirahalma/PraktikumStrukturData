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
public class ShellSortApp {

    private int[] arr;
    private int nElemen;

    public ShellSortApp(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void ShellSort() {
        int in, out;
        int temp;
        int h = nElemen / 2;
//        int h = 1;
//        h = 3 * h + 1;

        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = arr[out];
                in = out;
                while (in > h - 1 && arr[in - h] >= temp) {
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
                display();
            }
            h /= 2;
//            h = (h - 1) / 3;
        }
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        int maxSize = 100;
        ShellSortApp arr;
        arr = new ShellSortApp(maxSize);

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
        System.out.println("Shell Sort : ");
        arr.ShellSort();
        arr.display();

    }

}
