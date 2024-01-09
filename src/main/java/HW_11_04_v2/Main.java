package HW_11_04_v2;

public class Main {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        mainThread.setName("main");

        Thread firstThread = new myThread("first");
        firstThread.start();

        Thread secondThread = new myThread("second");
        secondThread.start();

        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(mainThread.getName() + ": " + i);
        }

        try {
            firstThread.join();
            System.out.println("Thread " + firstThread.getName() + " is finished.");
            secondThread.join();
            System.out.println("Thread " + secondThread.getName() + " is finished.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread " + mainThread.getName() + " is finished.");
    }
}
