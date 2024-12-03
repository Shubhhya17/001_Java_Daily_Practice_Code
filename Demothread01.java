class Demothread01 extends Thread {
    public void run(){
    for(
    int j = 1;j<=10;j++)
    {
        System.out.println("Child Thread");
    }
    }
public static void main(String args[]){
    Demothread01 d = new Demothread01();
    d.start();
    for(int i=1; i<=10; i++){
        System.out.println("Main Thread");
    }  

}

}
