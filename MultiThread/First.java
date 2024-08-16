/**
 * First
 */
class First { 
    public static void main(String args[]){

        RunThread runThread = new RunThread("Thread 1");
        RunThread runThread1 = new RunThread("Thread 2");



    }

    
}

class RunThread implements Runnable {

    private String Threadname;

Thread thread;

    RunThread (String X)
    {
    Threadname = X;
    thread = new Thread(this ,X);
    thread.start();
    }


    @Override
    public void run() {

        for (int i = 0 ; i <20 ; i++){
         /*   try{
                Thread.sleep(200);
                        }
                    catch (InterruptedException e)            
                    {e.printStackTrace();
                    }
            System.out.println(Threadname);
        }*/
        if (Threadname.equals("Thread 1"))
        {
            System.out.println("Ping from Thread 1");
        }
        else if (Threadname.equals("Thread 2"))
        {
            System.err.println("Ping from Thread 2");
        }

    }
}
}