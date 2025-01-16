class Super{
    public void display(){
        System.out.println("Super class display");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("Sub class display");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Super sup=new Sub(); 
        sup.display();

        
    }
    
}
