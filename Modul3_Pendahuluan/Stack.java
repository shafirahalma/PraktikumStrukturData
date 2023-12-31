package Modul3_Pendahuluan;
/**
 *
 * @author shafira halmahera
 */
class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long item) {
        stackArray[++top] = item;
//        System.out.println(item);
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
        }
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {

        return (top == maxSize - 1);

    }

}
