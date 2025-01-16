public class MethodOverloading {

    static double area(double l,double b){

        double a=l*b;
        return a;

    }

    static double area(double radius){

        double a=Math.PI*radius*radius;
        return a;

    }

    static double area(double a,double b,double h){
        double c=0.5*(a+b)*h;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Area of Reactangle: "+area(20,5));
        System.out.println("Area of circle: "+area(5));
        System.out.println("Area of Trapezium: "+area(3,4,6));
        
    }
    
}
