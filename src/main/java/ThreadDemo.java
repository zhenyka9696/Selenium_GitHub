public class ThreadDemo  extends Thread{ // класс Tread-ядро Java
    public static void main(String[] args) {
        System.out.println("Thread: " + Thread.currentThread().getName());
        System.out.println("Creating thread");

        Thread thread = new ThreadDemo();
        System.out.println("Starting thread");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread: " + thread.getName());
        System.out.println(Thread.currentThread().getName()+
                " is finished");

    }
@Override
        public void run(){
    for(int i=0; i<3;i++)
        System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getName()+
            " is finished");
    try {
        Thread.sleep(100);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    }

