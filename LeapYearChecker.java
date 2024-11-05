public class LeapYearChecker {
  public static void main(String[]args){
    int year = 1000;

    if(((year%4 == 0) &&(year %100 != 0)) || (year % 400 == 0)){
        System.out.println(year + " is a Leap year");
    }else{
        System.out.println(year + " is not a Leap year");
    }
  }  
}
