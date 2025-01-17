class Test{
    static int a=10;

    static{
        System.out.println("Block 1: "+a);
    }

    static{
        System.out.println("Block 2");
    }
}


public class StaticBlocks{
    public static void main(String[] args) {

        Test t1=new Test(); //exected the static blocks at the time of class is just loaded
        
    }
}