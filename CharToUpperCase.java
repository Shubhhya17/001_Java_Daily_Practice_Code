class CharToUpperCase {
    public static void main(String[] args) {
        char lowercaseChar = 'a';
        char uppercaseChar = (char) (lowercaseChar - 32);
        System.out.println("The uppercase of '" + lowercaseChar + "' is '" + uppercaseChar + "'");
    }
}
