public class MethodPractice {

   static int max(int x,int y){
         if(x>y){
            return x;
         }
         return y;
    }

    public static void main(String[] args) {

        int a=10,b=15,c;

       c=max(a,b);

       System.out.println(c);
        
    }
    
}
