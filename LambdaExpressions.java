
@FunctionalInterface
interface MyLambda{

    public void display();

}

// class My implements MyLambda{
//     public void display(){
//         System.out.println("Hello");
//     }
// } 


public class LambdaExpressions {
    public static void main(String[] args) {
        
        // MyLambda m=new MyLambda() {
            
        //     public void display(){
        //         System.out.println("");
        //     }
        // };

           MyLambda m=()->{
            System.out.println("Hello");
           };

           m.display();

    }
}
