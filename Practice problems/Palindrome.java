import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int N=sc.nextInt();
        int m=N;
        int rev=0;
        while(N>0){
            int n=N%10;
            rev=rev*10+n;
            N=N/10;

        }
        if(rev==m){
            System.out.println("The Given Number is Palidrome");
        }else{
            System.out.println("The given number is Not a palindrome");
        }
    }
    
}
