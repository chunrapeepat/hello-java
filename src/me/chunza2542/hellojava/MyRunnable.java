package src.me.chunza2542.hellojava;

public class MyRunnable implements Runnable {
    private Thread t;
    private String threadName;

    public MyRunnable(String name) {
        this.threadName = name;
        System.out.println("Creating " + name);
    }

    @Override
    public void run() {
        System.out.println("Running " + this.threadName);
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + this.threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted " + this.threadName);
        }
        System.out.println("Exiting " + this.threadName);
    }

    public void start() {
        System.out.println("Starting " + this.threadName);
        if (this.t == null) {
            t = new Thread(this, threadName);
            t.start();
        }

    }
}
