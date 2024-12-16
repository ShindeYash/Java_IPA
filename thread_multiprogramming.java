class T extends Thread {
//    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello world......" + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException i){
            System.out.println(i);
        }

    }
}

public class thread_multiprogramming {
    public static void main(String[] args) throws InterruptedException {
        T new_thread = new T();
        new_thread.start();

        for(int i = 0; i < 10; i++) {
            System.out.println("Hello main......" + i);
            Thread.sleep(1000);
        }
    }

}
