import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a=10,b=0,c;

        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number to divide: ");
        a=sc.nextInt();
        b=sc.nextInt();

        try{

            c=a/b;
    
            System.out.println("Division is : "+c);

        }catch(ArithmeticException e){

            System.out.println("Denominator should mot be zero");

        }finally{

            System.out.println("Bye");

        }


        


    }
}
