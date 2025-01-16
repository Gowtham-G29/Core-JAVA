class Parent{
    public Parent(){
        System.out.println("Parent Construct");
    }

    public Parent(int x){
        System.out.println("Param of Parent");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }

    public Child(int y){
        System.out.println("params of child");
    }

    public Child(int x,int y){
        super(x);
        System.out.println("2 params of Child");
    }
}


public class ConstructorInInheritance {

    public static void main(String[] args) {
        Child c=new Child(20,3);
    }
    
}
