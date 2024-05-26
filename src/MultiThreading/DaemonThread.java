package MultiThreading;

import java.io.IOException;

public class DaemonThread {
    public static void main(String[] args) {
        Thread userThread = new Thread(new WaitingForUserInput());
        userThread.start();
        userThread.setName("UserThreadInterrupt");
        userThread.setDaemon(true); //Comment this
    }
    private static class WaitingForUserInput implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            try {
                while (true) {
                    char input = (char) System.in.read();
                    if(input == 'q') {
                        return;
                    }
                }
            } catch (IOException e) {
                System.out.println("An exception was caught " + e);
            };
        }
    }
}
