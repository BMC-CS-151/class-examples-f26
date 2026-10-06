public class ContainsLetter {

    public static boolean containsLetter(String letter, String word) {
        if(word.length() == 0) {
            return false; //word.equals(letter);
        }
        
        if (!word.substring(0,1).equals(letter)) {
            return containsLetter(letter, word.substring(1));
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(containsLetter("l", "hello")); //T
        System.out.println(containsLetter("@", "@@@@")); //T
        System.out.println(containsLetter("l", "")); //F
    }
}
