class MyRunnable implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}


public class RunnableInterfaceMultiThreading extends MyRunnable {
    public static void main(String[] args) {

        RunnableInterfaceMultiThreading r=new RunnableInterfaceMultiThreading();
        Thread th=new Thread(r);
        th.start();

        int i=1;

        while (true) {
            System.out.println(i+" World");
            i++;
        }


        
    }
}
