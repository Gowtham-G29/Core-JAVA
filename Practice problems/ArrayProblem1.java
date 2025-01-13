import java.util.Scanner;

public class ArrayProblem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];

        System.out.println("Enter elements in the Array: ");
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }

        System.out.println("The elements in the array are: ");
        for(int X:A){
            System.out.print(X+" ");
        }
        System.out.println(" ");

        //sum of all elements
        int sum=0;
        for(int X:A){
             sum=sum+X;
        }
        System.out.println("Sum of all the elements in the array is: "+sum);


        //search the element
        System.out.println("Enter the element to be searched: ");
        int elementToSearch=sc.nextInt();

        for(int i=0;i<=A.length;i++){
            if(elementToSearch==A[i]){
                System.out.println("The element found at the index of: "+(i+1));
                break;
            }
        }

        //maximum element
        int Max=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>Max){
                Max=A[i];
            }
        }
        System.out.println("The Maximum element in the array is "+Max);

        
        //Finding the second largest element
        for(int i=0;i<=A.length;i++){
            if(Max==A[i]){
               System.out.println("Second largest element in the array is :"+A[i-1]);
                break;
            }
        }


  }
    
}
