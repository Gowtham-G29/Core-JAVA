import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedStreams {
    public static void main(String[] args) {
        
        try {
            FileInputStream fis=new FileInputStream("Test.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);

            int x;
            while((x=bis.read())!=-1){
                System.out.print((char)x);
            }
            
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

    }
}
