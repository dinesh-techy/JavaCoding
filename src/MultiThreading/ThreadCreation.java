package MultiThreading;

public class ThreadCreation {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running with a thread name:: "+Thread.currentThread().getName());
                System.out.println("Thread is running with a thread id:: "+Thread.currentThread().getName());
                System.out.println("Thread is running with a thread priority:: "+Thread.currentThread().getPriority());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Custom Error");
            }
        });

        //Set a name for thread
        thread.setName("Worker thread");
        System.out.println("Before starting of thread ::"+Thread.currentThread().getName());
        thread.start();
        System.out.println("After ending of thread ::"+Thread.currentThread().getName());
        Thread.sleep(20000);
        //
        thread2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("An error in the thread happened for the thread::"+t.getName()+" with a error message "+e.getMessage());
            }
        });
        thread2.start();
    }
}
