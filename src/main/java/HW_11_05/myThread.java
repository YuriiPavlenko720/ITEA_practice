package HW_11_05;

import org.jetbrains.annotations.NotNull;

class myThread extends Thread {

    private Thread myT;

    public myThread(@NotNull String name) {
        super(name);
    }

    public void setMyT(Thread t) {
        this.myT = t;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(1000);
                if (i == 3) {
                    myT.join();
                }
                System.out.println(this.getName() + ": " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread " + this.getName() + " is finished.");
    }
}
