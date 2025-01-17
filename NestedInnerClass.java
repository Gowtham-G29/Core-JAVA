class Outer{
    int x=10;

    class Inner{
        int y=20;
        public void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }
    
    public void display(){
        Inner i=new Inner();
        i.innerDisplay();
        System.out.println("form outer: "+i.y);
    }
}


public class NestedInnerClass {
    public static void main(String[] args) {

        Outer o=new Outer();
        o.display();

        Outer.Inner in=new Outer().new Inner();

        in.innerDisplay();
        
    }
}
