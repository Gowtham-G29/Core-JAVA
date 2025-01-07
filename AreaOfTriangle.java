import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float base,height,area;

        System.out.println("Enter the Base and Height of the Triangle: ");
        base=sc.nextFloat();
        height=sc.nextFloat();

        area =base*height/2;
        System.out.println("Area of the Triangle: "+area);
    }
    
}
