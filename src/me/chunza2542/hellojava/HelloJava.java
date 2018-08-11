package src.me.chunza2542.hellojava;

public class HelloJava {

    private static int counter = 1;
    private static String secret = "chunza2542";

    private static abstract class Animal {
        public abstract void speak();
    }

    private static class InnerClass {
        public void print() {
            System.out.println("Hello from inner class!!!");
        }
        public void printSecret() {
            System.out.println("The secret is: " + secret);
        }
    }

    public static void printMax(int... numbers) {
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }

        System.out.println("The max number is " + max);
    }

    public static void main(String[] args) {
        // create instances
        HelloJava chun = new HelloJava();
        chun.counter++;

        HelloJava steve = new HelloJava();
        steve.counter++;

        // print the counter output
        System.out.println("Counter: " + HelloJava.counter);

        // print the max numbers
        printMax(new int[]{10, 20, 30});

        // print data from inner class
        InnerClass inner = new InnerClass();
        inner.printSecret();
    }

}
