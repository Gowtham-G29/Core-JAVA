import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Number To Reverse: ");
        int N=sc.nextInt();
        int rev=0;

        while(N>0){
            int n=N%10;
             rev=rev*10+n;
             N=N/10;

        }
        System.out.print("The reversed Number is: "+rev);
    }
    
}
