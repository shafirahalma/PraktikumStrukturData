/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_Pendahuluan;

/**
 *
 * @author LAB PROGRAMMING 1
 */
public class HighArray1 {

    private int[] arr;
    private int nElemen;

    public HighArray1(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public boolean find(int key) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (arr[i] == key) {
                break;
            }
        }

        if (i == nElemen) {
            return false;
        } else {
            return true;
        }
    }

    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (value == arr[i]) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                arr[j] = arr[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    public void BubbleSort() {
        int batas, i;

        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {

                if (arr[i] < arr[i + 1]) {
                    swap(i, i + 1);
                }
//                display();
            }

        }
    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public void SelectionSort() {
        int awal, i, min;

        for (awal = 0; awal < nElemen - 1; awal++) {
            min = awal;
            for (i = awal + 1; i < nElemen; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }

            swap(awal, min);
//            display();
        }
    }

    public void InsertionSort() {
        int i, curIn;

        for (curIn = 1; curIn < nElemen; curIn++) {
            int temp = arr[curIn];

            i = curIn;
            while (i > 0 && arr[i - 1] >= temp) {
                arr[i] = arr[i - 1];
                display();
                i--;

            }

            arr[i] = temp;
            display();
        }
    }

    
    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
