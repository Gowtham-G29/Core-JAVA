import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStream {
    public static void main(String[] args) throws Exception {
        
        byte b[]={'a','b','c','d','e','f','g','h'};



        ByteArrayInputStream bis=new ByteArrayInputStream(b);

        int x;
        while((x=bis.read())!=-1){
            System.out.print((char)x);

        }
        bis.close();


        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

       byte c[]= bos.toByteArray();

       for(byte cc:c){
          System.out.println((char)cc);
       }
    }
}
