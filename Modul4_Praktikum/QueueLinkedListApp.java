package Modul4_Praktikum;

/**
 *
 * @author shafira halmahera
 */
public class QueueLinkedListApp {

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.insert(1665100, "Dee");
        queue.insert(1665200, "Deaja");
        queue.display();
        System.out.println();
        
        queue.insert(1665300, "Ami");
        queue.insert(1665400, "Haya");
        queue.insert(1665500, "Yati");
        queue.display();
        System.out.println();
        
        queue.remove();
        queue.remove();
        queue.display();
    }

}
