// import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyingPractice{
    public static void main(String[] args) {
        
        try{

            FileOutputStream fwr=new FileOutputStream("source1.txt");

            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();

            fwr.write(str.getBytes());

            fwr.close();
        }catch(IOException e){

            System.out.println(e.getMessage());
        }

        try{

            FileOutputStream  fos=new FileOutputStream("source2.txt");
            FileInputStream fis=new FileInputStream("source1.txt");

            byte b[]=new byte[fis.available()];

            fis.read(b);

            String str=new String(b);

            fos.write(str.toLowerCase().getBytes());
            fos.close();
            fis.close();


        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}