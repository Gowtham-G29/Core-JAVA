import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        
        //always handle file in the try and catch blocks
        
        try  {

            FileOutputStream fos = new FileOutputStream("Test.txt");
            String str="Learn java programming";

            // fos.write(str.getBytes());// write the file ,getbytes() is converts the array of bytes 

            byte b[]=str.getBytes();

            fos.write(b,6,str.length()-6);

            fos.close();

        } catch (IOException e) {

           System.out.println(e.getMessage()); 
        }
    }
}
