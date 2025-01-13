import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int N=sc.nextInt();
        int count=0;

        while(N>0){
            int n=N%10;
            N=N/10;
            System.out.println(n);
            count++;
        }
        System.out.println("The count is : "+count);
    }
    
}
