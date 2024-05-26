package MultiThreading;

public class ThreadTermination {
    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());
        thread.start();
        thread.interrupt();
    }
    public static class BlockingTask implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println("Exiting blocking thread....");
            }
        }
    }
}
