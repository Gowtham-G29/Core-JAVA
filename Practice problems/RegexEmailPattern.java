public class RegexEmailPattern {
    public static void main(String[] args) {
        String str1="gowtham25@gmail.com";

        boolean isemail=str1.matches("\\w*@gmail(.*)");

        if(isemail){
            int atIndex=str1.indexOf('@');
            String userName=str1.substring(0,atIndex);
            System.out.println("Username is: "+userName);

            String DomainName=str1.substring(atIndex+1);
            System.out.println("Domain Name: "+DomainName);
            if(DomainName.startsWith("gmail")){
                System.out.println("Your Domain is vaild !");
            }else{

                System.out.println("Your Domain is Not a gmail");

            }
        }else{
            System.out.println("Please enter the Valid email id!");
        }
    }
}

