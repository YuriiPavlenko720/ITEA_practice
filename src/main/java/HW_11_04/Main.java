package HW_11_04;

public class Main {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        mainThread.setName("main");
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1500);
                if (i == 3) {
                    Thread firstThread = new myThread("first");
                    firstThread.start();
                }
                if (i == 6) {
                    Thread secondThread = new myThread("second");
                    secondThread.start();
                }
                System.out.println(mainThread.getName() + ": " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread " + mainThread.getName() + " is finished.");
    }
}
