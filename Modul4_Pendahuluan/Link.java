package Modul4_Pendahuluan;

/**
 *
 * @author shafira halmahera
 */
public class Link {

    public int Data;
    public Link next;
    Link previous;

    public Link(int Data) {
        this.Data = Data;

    }

    public void displayLink() {
        System.out.print(Data + " ");
    }

}
