import java.io.IOException;
import java.io.*;

public class RandomAccessFileDemo {
    public static void main(String[] args) {


        try{

            RandomAccessFile fr=new RandomAccessFile( "Data.txt","rw");
            System.out.println((char)fr.read());
            System.out.println((char)fr.read());
            fr.write('c');
            System.out.println((char)fr.read());
            fr.skipBytes(3);
            System.out.println((char)fr.read());
            fr.seek(3);
            System.out.println((char)fr.read());

            System.out.println(fr.getFilePointer());
            
            fr.seek(fr.getFilePointer()+2);





        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
