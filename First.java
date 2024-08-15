class First implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try{
                Thread.sleep(400);
                            }
                            catch (InterruptedException e) {
                                e.printStackTrace();
                            }
            System.err.println("From run method");
        }
    }

    public static void main(String[] args) {
        /*
         * Intro To Thread
         */

        First first = new First();
        Thread thread = new Thread(first);

        thread.start();
        for (int i = 0; i < 20; i++) {
            try{
                Thread.sleep(500);
                            }
                            catch (InterruptedException e) {
                                e.printStackTrace();
                            }
            System.out.println("From MAIN method");
        }

    }
}