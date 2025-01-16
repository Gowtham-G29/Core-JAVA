
class Rectangle{
    public int length;
    public int breadth;

   public Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    void display(){
        System.out.println("Length: "+this.length);
        System.out.println("Breadth: "+this.breadth);
    }
}



public class ThisAndSuperKeyword {
    public static void main(String[] args) {

        Rectangle r1=new Rectangle(5, 10);
        Rectangle r2=new Rectangle(20, 15);

        r1.display();
        r2.display();
        
    }
}
