package Multithreading;

class SyncExample {

    int count = 0;

    synchronized void methodSync() {
        count++;
    }

    void blockSync() {
        synchronized (this) {
            count++;
        }
    }

    public static void main(String[] args) throws Exception {

        SyncExample obj = new SyncExample();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                obj.methodSync();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                obj.blockSync();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count = " + obj.count);
    }
}
