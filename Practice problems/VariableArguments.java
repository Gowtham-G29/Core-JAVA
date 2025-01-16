public class VariableArguments {

    static void show(int ...X){

        System.out.println(X[2]);

        for(int A:X){
            System.out.println(A);
        }

    }

    public static void main(String[] args) {

     show(1,2,3,4,5,6);
        
    }
    
}
