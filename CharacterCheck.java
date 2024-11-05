class CharacterCheck {
   public static void main(String[] args) {
      char ch = 'a';

      if (ch >= 'a' && ch <= 'z') {
         System.out.println(ch + " is a Lowercase Letter.");
      } 
      else if (ch >= 'A' && ch <= 'Z') {
         System.out.println(ch + " is an Uppercase Letter.");
      } 
      else if (ch >= '0' && ch <= '9') {
         System.out.println(ch + " is a Digit.");
      } 
      else {
         System.out.println(ch + " is a Special Symbol.");
      }
   }
}
