package Multithreading;
class VolatileExample {

    volatile boolean running = true;

    void stop() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {

        VolatileExample obj = new VolatileExample();

        Thread t1 = new Thread(() -> {
            while (obj.running) {
            }
            System.out.println("Stopped");
        });

        t1.start();
        Thread.sleep(1000);
        obj.stop();
    }
}
