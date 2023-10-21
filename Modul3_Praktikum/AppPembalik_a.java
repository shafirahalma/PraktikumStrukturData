package Modul3_Praktikum;

/**
 *
 * @author shafira halmahera
 */
public class AppPembalik_a {

    public static void main(String[] args) {
        String input = "kasur";
        String output;
        Pembalik pembalik_kata = new Pembalik(input);
        output = pembalik_kata.membalik();
        System.out.println(">>katanya...");
        System.out.println("\t" + input);
        System.out.println(">>dibalik jadi...");
        System.out.println("\t" + output);

    }

}
