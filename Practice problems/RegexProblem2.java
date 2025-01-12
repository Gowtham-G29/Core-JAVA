import java.util.Scanner;

public class RegexProblem2 {
    public static void main(String[] args) {
        //find the Number is Binary or Not
        //Find the Number is hexa decimal or Not
        //Find is the data in Date format(dd//mm//yyyy)

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Binary Number");
        int binary=sc.nextInt();
        String IntTOString=binary+"";

        boolean isBinary=IntTOString.matches("[0-1]+");
        if(isBinary){
            System.out.println("The Given Number is Binary");
        }else{
            System.out.println("The given number is not a Binary");
        }


        System.out.print("Enter the hexadecimal Number :");
        String hex=sc.next();

        boolean isHexadecimal=hex.matches("[1-9A-F]+");

        if(isHexadecimal){
            System.out.println("The given number is Hexadecimal");
        }else{
            System.out.println("The given number is not hexadecimal");
        }  


        System.out.print("Enter the date: ");
        String date=sc.next();

        boolean isDate=date.matches("\\d{1,2}/\\d{1,2}/\\d{4}");

        if(isDate){
            System.out.println("The Date is correct");
        }else{
            System.out.println("The Date is wrong");
        }

     }
    
}
