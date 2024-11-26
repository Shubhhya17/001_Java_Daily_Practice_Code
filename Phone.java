abstract class Realme{
    void playYoutube(){
        System.out.println("Playing Youtube form Realme");
    }
    abstract void sendSMS();
}
class Airtel extends Realme{    
    void sendSMS(){
        System.out.println("Sending SMS form Airtel");
    }
}
class Jio extends Realme{
    void sendSMS(){
        System.out.println("Sending sms from jio");
    }
}

class Phone {
    public static void main(String args[]){
        Realme r1 = new Airtel();
        r1.playYoutube();
        r1.sendSMS();
    }
}
