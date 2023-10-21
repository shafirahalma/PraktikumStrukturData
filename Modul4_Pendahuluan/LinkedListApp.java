package Modul4_Pendahuluan;

/**
 *
 * @author shafira halmahera
 */
public class LinkedListApp {

    public static void main(String[] args) {
        LinkedList theList = new LinkedList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.dislplayList();

        while (!theList.isEmpty()) {
            Link aLink = theList.deleteFirst();

            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }

        theList.dislplayList();

        theList.insertFirst(33);
        theList.insertFirst(55);
        theList.insertFirst(77);
        theList.insertFirst(88);
        theList.dislplayList();

        Link f = theList.find(77);
        if (f != null) {
            System.out.println("ketemu..." + f.Data);
        } else {
            System.out.println("link tidak ditemukan");

        }

        Link d = theList.delete(88);
        if (d != null) {
            System.out.println("hapus link dengan key " + d.Data);
        } else {
            System.out.println("link tidak ditemukan");
        }
        theList.dislplayList();
    }

}
