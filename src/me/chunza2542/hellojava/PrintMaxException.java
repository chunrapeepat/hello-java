package src.me.chunza2542.hellojava;

public class PrintMaxException extends Exception{
    private int length;

    PrintMaxException(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }
}
