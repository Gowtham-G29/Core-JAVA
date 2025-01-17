
class Phone{
    public void call(){

       System.out.println("Phone call");

    }
    public void sms(){
        System.out.println("Phone sending sms");
    }
}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void stop();
}

class Smartphone extends Phone implements ICamera,IMusicPlayer{
    public void videoCall(){
      System.out.println("SmartPhone videocall");
    }
    public void click(){
        System.out.println("Smartphone Clicking");
    }
    public void record(){
        System.out.println("System phone recording");
    }

    public void play(){
        System.out.println("Smart phone play music");
    }

    public void stop(){
        System.out.println("Smart phone stopped playmusic");
    }
} 

public class MultipleInterfaces {
    public static void main(String[] args) {

        Smartphone sp=new Smartphone();
        sp.call(); 
        sp.click();
        sp.play();
        sp.videoCall();
        
    }
    
}
