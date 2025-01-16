import java.util.Scanner;

public class ReverseAnArray {
    static void rotate(int A[],int B[]){
        for (int i = 0; i < A.length; i++) {
            B[i] = A[A.length - 1 - i]; 
        }
    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();

       int A[]=new int[size];
       int B[]=new int[size];

       for(int i=0;i<A.length;i++){
        System.out.print("Enter the "+i+" element: ");
          A[i]=sc.nextInt();

        }
        rotate(A,B);
        for(int X:B){
            System.out.println(" "+X);
        }


   }

}
