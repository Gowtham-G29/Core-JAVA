public class StringMethods {
    public static void main(String[] args) {
        
        String str=new String("   Netbeans");

        int l= str.length(); //returns the length of the string
        System.out.println(l);

        str=str.trim();//remove the padding spaces 

        String upper=str.toUpperCase(); //returns the string with uppercases
        System.out.println(upper);

        String lower=str.toLowerCase(); //returns the string with Lowercase
        System.out.println(lower);
 
        String str1=str.substring(3,6);
        System.out.println(str1);

        String repla=str.replace('e','g');
        System.out.println(repla);

        String str2="Mr. shahruk .Khan";
        System.out.println(str2.startsWith("Mr."));// check the starting word
        System.out.println(str2.endsWith("Khan"));
        System.out.println(str2.charAt(4));
        System.out.println(str2.indexOf('.'));
        System.out.println(str2.indexOf(".",4));
        System.out.println(str2.lastIndexOf(".",4));

        String s1="Pyramid";
        String s2="Pyramid";
        String s3="Java";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s3.compareTo(s1));


        
        





       
    }
    
}
