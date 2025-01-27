import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferMarking {
    public static void main(String[] args) {

        try{
            FileInputStream fis=new FileInputStream("Test.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            bis.mark(10);
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            bis.reset();
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
      


    }
}
