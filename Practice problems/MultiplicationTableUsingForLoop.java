import java.util.Scanner;

public class MultiplicationTableUsingForLoop {
    public static void main(String[] args) {

        int N=10;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Table: ");
        int Table=sc.nextInt();
        
        for(int i=1;i<=N;i++){
           System.out.println(Table+" x "+i+" = "+Table*i);
        }
    }
    
}
