import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        //cubes of the sum of the digits are equal to the same number is armstrong

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");

        int N=sc.nextInt();
        int m=N;
        double sum=0;

        while(N>0){
            int n=N%10;
            sum=sum+Math.pow(n, 3);
            N=N/10;

        }
        System.out.println("The Value is: "+(int)sum);
        if(m==sum){
            System.out.println("The Given Number is armstrong");

        }else{
            System.out.println("The Given Number is Not an armstrong");
        }
        
    }
    
}
