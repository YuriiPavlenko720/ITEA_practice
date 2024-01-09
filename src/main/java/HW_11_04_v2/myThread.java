package HW_11_04_v2;

import org.jetbrains.annotations.NotNull;

class myThread extends Thread {

    public myThread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(this.getName() + ": " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


