import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the n: ");

        int N=sc.nextInt();

        int sum=0;

        for(int i=0;i<=N;i++){
            sum=sum+i;
        }

        System.out.println("Total n number is :"+sum);
        
    }
    
}
