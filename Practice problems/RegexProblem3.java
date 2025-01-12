import java.util.Scanner;

public class RegexProblem3 {
    public static void main(String[] args) {
        //Remove the Special characters from the string
        //Remove extra spaces from string
        //Find the number of words in a string


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your String: ");
        String str=sc.next();
        String pureStr=str.replaceAll("\\W", "");
        System.out.println("The pure String is: "+pureStr);
         
        int words=pureStr.length();

        System.out.println("The length of the String is : "+words);
    }
    
}
