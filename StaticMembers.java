class Test{
    static int x=10;
    int y=20;
    static void display(){

        System.out.println("The value of X is :"+ x);

    }

    void show(){
        System.out.println(y);
    }
}


public class StaticMembers {

    public static void main(String[] args) {

      Test t1=new Test();
      Test.display();
      System.out.println(Test.x);
      t1.show();
        
    }
    
}
