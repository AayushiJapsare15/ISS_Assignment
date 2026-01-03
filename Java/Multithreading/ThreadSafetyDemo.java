package Multithreading;

class ThreadSafetyDemo {

    int instanceCount = 0;   // instance variable (shared)

    void instanceIncrement() {
        instanceCount++;
    }

    void localIncrement() {
        int localCount = 0;   // local variable (thread-safe)

        for (int i = 0; i < 1000; i++) {
            localCount++;
        }

        System.out.println(
            Thread.currentThread().getName() +
            " Local Count = " + localCount
        );
    }

    public static void main(String[] args) {

        ThreadSafetyDemo obj = new ThreadSafetyDemo();

        // Creates a new thread
        // Uses lambda expression (Runnable)
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                obj.instanceIncrement();
            obj.localIncrement();
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                obj.instanceIncrement();
            obj.localIncrement();
        }, "Thread-2");

        t1.start();
        t2.start();



        try {
            t1.join();
            t2.join();
        } catch (Exception e) {}
        //join() Synchronization with main
        // Makes main thread wait
        // Ensures both threads finish execution
        // Without this, main may print result early

        System.out.println("Final Instance Count = " + obj.instanceCount);
    }
}
