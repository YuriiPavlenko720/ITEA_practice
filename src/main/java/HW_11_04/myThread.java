package HW_11_04;

import org.jetbrains.annotations.NotNull;

class myThread extends Thread{
    public myThread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1500);
                System.out.println(this.getName() + ": " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread " + this.getName() + " is finished.");
    }
}
