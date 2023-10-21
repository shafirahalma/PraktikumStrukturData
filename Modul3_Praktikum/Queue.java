package Modul3_Praktikum;

import Modul3_Pendahuluan.*;
/**
 *
 * @author shafira halmahera
 */
class Queue {

    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;

    }

    public void insert(String value) {
        try {
            queArray[++rear] = value;
            System.out.println(value + " masuk antrian");
            nItems++;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Maaf " + value + ", antrian masih penuh");
        }
    }

    public String remove() { //objek keluar satu per satu sampai antrian kosong
        String temp = queArray[front++];
        queArray[front - 1] = "kosong";
        if (front == maxSize) {
            front = 0;

        }
        nItems--;
        System.out.println(temp + " keluar antrian ");
        return temp;
    }

    public String peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

    public void display() {
        int temp = this.front;
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[front++] + ",");
            if (front == maxSize) {
                front = 0;
            }
        }
        System.out.println();
        front = temp;
        System.out.println("");
    }

}
