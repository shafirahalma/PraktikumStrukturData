/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_PrakStrukdat;

/**
 *
 * @author shafira halmahera
 */
public class No2_Fibonacci {

    public static int triangleIter(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }
        return result;
    }

    public static int triangleRecur(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangleRecur(n - 1);
        }
    }

    public static void main(String[] args) {

        int n = 10,
        firstElemen = 1,
        secondElemen = 1;
       
        System.out.println("Deret Fibonaci " + n + " Elemen:");
 
         for (int i = 1; i <= n; ++i) {
         System.out.print(firstElemen + ", ");
       
        // menghitung suku berikutnya
        int nextTerm = firstElemen + secondElemen;
        firstElemen = secondElemen;
        secondElemen = nextTerm;
         }  
      
        System.out.println(" ");
        System.out.println("=========================");
        System.out.println("Menggunakan Recursion : " + triangleRecur(10));
      
        

    }
}
