
class Rectangle{
    private double length;
    private double breadth;

    public Rectangle(){
        length=1;
        breadth=1;
    }
    public Rectangle(double l,double b){
         length=l;
         breadth=b;
    }

    public double area(){
        return length*breadth;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        Rectangle rec2=new Rectangle(5.0d, 10.0d);

        System.out.println("Area1: "+rec.area());
        System.out.println("Area2: "+rec2.area());


    }
    
}
