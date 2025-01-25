class MyThread extends Thread{
    public MyThread(){
        setDaemon(true);// main method ends it thread also terminating
    }

    public void run(){
        int count=1;
        while(true){
            System.out.println(count++ +" My thread");
        }
    }
}
public class ThreadPractice2 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();

        // try{
        //     Thread.sleep(100);
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        // try {
        //     Thread mainThread=Thread.currentThread();
        //     mainThread.join();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

       
         
        int count=1;
        while(true){
            System.out.println(count++ +" Main");
            Thread.yield();;

        }



       
    }
}
