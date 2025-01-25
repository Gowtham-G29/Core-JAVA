class MyThread extends Thread{
   

    public MyThread(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run(){
        int count=1;
        
        while (true) {
            System.out.println(count++);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }


}


public class ThreadMethods  {
    public static void main(String[] args) throws Exception {

       MyThread th=new MyThread("Gowtham");

        System.out.println(th.getId());
        System.out.println(th.getName());
        System.out.println(th.getPriority());
        th.start();
        th.interrupt();
        System.out.println(th.getState());
        System.out.println(th.isAlive());

    }
}
