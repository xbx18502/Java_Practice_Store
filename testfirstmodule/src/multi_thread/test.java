package multi_thread;

public class test{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("main---"+i);
        }
        testthread t = new testthread();
        t.start();
        for(int i=0;i<100;i++){
            System.out.println("main---main---"+i);
        }
    }

}
