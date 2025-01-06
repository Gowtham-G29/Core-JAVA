import java.util.Scanner;

public class UseRadix {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //convert the scanner input to decimal to binary
        sc.useRadix(2);

        int x=sc.nextInt();

        System.out.println(x);
    }
    
}
