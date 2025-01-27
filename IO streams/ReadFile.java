// import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try{
            // FileInputStream fis=new FileInputStream("Test.txt");
            FileReader fis=new FileReader("Test.txt");


            int x;
            while ((x=fis.read())!=-1) {
                System.out.print((char)x);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
