package multi_thread;

public class testthread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("child thread---"+i);
        }
    }
}
