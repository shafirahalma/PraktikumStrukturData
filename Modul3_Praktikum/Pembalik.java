package Modul3_Praktikum;

/**
 *
 * @author shafira halmahera
 */
public class Pembalik {

    private String input;
    private String output;

    public Pembalik(String in) {
        input = in;
    }

    public String membalik() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char value = input.charAt(i);
            theStack.push(value);
        }

        output = "";
        while (!theStack.isEmpty()) {
            char value = (char) theStack.pop();
            output += value;
        }
        return output;

    }
}
