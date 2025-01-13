import java.util.Scanner;

public class RotationOfArray {

    //Rotation means shifting the elements by one places left or right
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int A[]=new int[10];
        System.out.println("Enter elements in the array are: ");
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }

        int temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }

        A[A.length-1]=temp;
        
        for(int X:A){
            System.out.print(X+",");
        }



        
    }
    
}
