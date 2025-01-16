import java.util.Scanner;

class Cylinder{

    private int radius;
    private int height;

    public void setRadius(int r){
        radius=r;
    }

    public void setHeight(int h){
        height=h;
    }


    public double totalSurfaceArea(){

        return 2*Math.PI*radius*(height+radius);

    }

    public double volume(){

        return Math.PI*(radius*radius)*height;

    }
}


public class ClassCylinder {
    public static void main(String[] args) {

        Cylinder cl=new Cylinder();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder: ");
        cl.setRadius(sc.nextInt());
        System.out.println("Enter the height of the Cylinder: ");
        cl.setHeight(sc.nextInt());

        System.out.println("Total Surface Area: "+cl.totalSurfaceArea());
        System.out.println("Volume: "+cl.volume());
        
        
    }
}
