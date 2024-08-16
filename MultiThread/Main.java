package MultiThread;

public class Main {
    public static void main(String[] args) {
        /*
         Multi Thread
         */

        RunThread runThread = new RunThread("Thread 1");
        RunThread runThread1 = new RunThread("Thread 2");
    }

}

class RunThread implements Runnable {
    private String threadName;
    private Thread thread;

    RunThread(String name) {
        threadName = name;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(threadName);
        }
    }
}