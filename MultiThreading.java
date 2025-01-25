class Myclass extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+ " Hello");
            i++;
        }
    }
}

public class MultiThreading  {
    public static void main(String[] args) {

        Myclass m=new Myclass();
        m.start();
        int i=1;
        while (true) {
            System.out.println(i+" world");
            i++;
        }
        
    }
    
}
