import java.util.Scanner;

public class DisplayNumberInWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N=sc.nextInt();
 
        int rev=0;

        while(N>0){
             int n=N%10;
             rev=rev*10+n;
             N=N/10;
        }
        System.out.println(rev);

        String Number=rev+"";
        char c;
        for(int i=Number.length()-1;i>=0;i--){
           c=Number.charAt(i);
           switch (c) {
            case '0':
                  System.out.print("Zero ");
                break;
            case '1':
                  System.out.print("One ");
                break;
            case '2':
                  System.out.print("Two ");
                 break;
            case '3':
                  System.out.print("Three ");
                 break;
            case '4':
                  System.out.print("Four ");
                 break;
            case '5':
                  System.out.print("Five ");
                 break;
             case '6':
                 System.out.print("Six ");
                  break;
             case '7':
                  System.out.print("Seven ");
                  break;
             case '8':
                  System.out.print("Eight ");
                  break;
             case '9':
                  System.out.print("Nine ");
                  break;
            default:
                break;
           }
        }

    }
    
}
