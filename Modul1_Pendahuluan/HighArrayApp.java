package Modul1_Pendahuluan;

/**
 *
 * @author shafira halmahera
 */
public class HighArrayApp {

    public static void main(String[] args) {
        int maxSize = 9;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insertOrdered(53);
        arr.insertOrdered(79);
        arr.insertOrdered(77);
        arr.insertOrdered(81);
        arr.insertOrdered(15);
        arr.insertOrdered(45);
        arr.insertOrdered(30);
        arr.insertOrdered(66);

//        arr.insert(70);
//        arr.insert(80);
//        arr.insert(75);
//        arr.insert(55);
//        arr.insert(85);
//        arr.insert(25);
//        arr.insert(30);
//        arr.insert(00);
//        arr.insert(90);
//        arr.insert(40);
//
     arr.display();

        int key = 99;
        if (arr.binarySearch(key)) {
            System.out.println(key
                    + " ditemukan");
        } else {
            System.out.println(key
                    + " tidak ditemukan");
        }

        arr.delete(00);
        arr.delete(80);
        arr.delete(55);
        arr.size();

        arr.display();
    }
}
