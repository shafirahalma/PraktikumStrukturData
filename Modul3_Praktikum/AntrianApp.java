package Modul3_Praktikum;
/**
 *
 * @author shafira halmahera
 */
public class AntrianApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(4);
        System.out.println(">> Beberapa mulai mengantri");
        theQueue.insert("Fira");
        theQueue.insert("Vivin");
        theQueue.insert("Anggun");
        theQueue.insert("Nia");
        theQueue.insert("Salma");
        theQueue.insert("Aisya");
        System.out.println("");
        System.out.println(">> isi antrian");
        theQueue.display();
        System.out.println(">> satu persatu mulai keluar antrian");
        while (!theQueue.isEmpty()) {
            String n = theQueue.remove();
            if (theQueue.peekFront().equals("kosong")) {
                theQueue.display();
                System.out.println("antrian kosong");
                System.out.println(theQueue.size() + "Person");
                theQueue.display();
                break;
            }
            theQueue.display();
        }
        System.out.println("");
    }
}
