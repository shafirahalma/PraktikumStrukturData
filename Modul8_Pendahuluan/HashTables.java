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
public class HashTables {

    private Data[] hashArray;
    private int size;

    public HashTables(int size) {
        this.size = size;
        hashArray = new Data[size];
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            if (hashArray[j] != null) {
                System.out.println(" | " + j + "\t | "
                        + hashArray[j].getKey() + " |");
            } else {
                System.out.println(" | " + j + "\t | -- |");
            }
        }
        System.out.println("");
    }

    public int hashFunc(int key) {
        return key % size;
    }

    public void insert(int key) {
        //untuk memasukkan datanya
        Data item = new Data(key);
        key = item.getKey();
        int hashVal = hashFunc(key);
        //int i = hashVal
        int step = 0;
        while (hashArray[hashVal] != null) {
            ++hashVal;
            hashVal %= size;
//               hashVal = (hashVal + step * step)%size;
//               step++;
        }
        hashArray[hashVal] = item;
    }

    public Data delete(int key) {
        int hashVal = hashFunc(key);
//        int i = hashVal;
//        int step = 0;
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                Data temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            ++hashVal;
            hashVal %= size;
//            step++;
//            int hashValue = i + step * step;
//            hashVal = hashValue % size;
        }
        return null;
    }

    public Data find(int key) {
        int hashVal = hashFunc(key);
//        int i = hashVal;
//        int step = 0;
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= size;
//            step++;
//            int hashValue = i + step * step;
//            hashVal = hashValue % size;
        }
        return null;
    }
} //akhir class HashTables
