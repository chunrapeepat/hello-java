package src.me.chunza2542.hellojava;

public class HelloJava {

    private static int counter = 1;

    public static void main(String[] args) {
        // create instances
        HelloJava chun = new HelloJava();
        chun.counter++;

        HelloJava steve = new HelloJava();
        steve.counter++;

        // print the output
        System.out.println("Counter: " + HelloJava.counter);
    }

}
