package HW_11_05;

public class Main {
    public static void main(String[] args) {
        myThread thread1 = new myThread("first");
        myThread thread2 = new myThread("second");

        thread1.setMyT(thread2);
        thread2.setMyT(thread1);

        thread1.start();
        thread2.start();
    }
}
