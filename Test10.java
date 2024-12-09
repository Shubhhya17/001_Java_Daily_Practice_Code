class Test10 extends Thread{
    public void run(){
        for(int i =1; i<=10; i++){
            System.out.println("Userdifed Thread");
        }
    }
    public static void main(String args[]){
        Test10 a = new Test10();
        a.start();

        for(int i = 1; i<=10; i++){
            System.out.println("Predifiend Thread");
        }
    }
}
