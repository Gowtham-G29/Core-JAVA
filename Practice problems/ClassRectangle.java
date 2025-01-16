import java.util.Scanner;

class Rectangle{

    public int length;
    public int breadth;

    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSquare(){
        if(length==breadth){
            return true;
        }
        return false;
    }
}


public class ClassRectangle {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Rectangle rec=new Rectangle();

        System.out.println("Enter the Length of the rectangle: ");
        rec.length=sc.nextInt();
        System.out.println("Enter the breadth of the Rectangle: ");
        rec.breadth=sc.nextInt();
        
        int area=rec.area();
        int perimeter=rec.perimeter();

        System.out.println("Area: "+area);
        System.out.println("Perimer: "+perimeter);
        System.out.println("Square?: "+rec.isSquare());
    }
    
}
