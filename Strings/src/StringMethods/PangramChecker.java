package StringMethods;

public class PangramChecker {
    
    public static boolean isPangram(String str) {

        boolean[] letterArray = new boolean[26];
        

        for (char ch : str.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {

                letterArray[ch - 'a'] = true;
            }
        }
        
        for (boolean isPresent : letterArray) {
            if (!isPresent) {
                return false; 
            }
        }
        
        return true; 
    }
    
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        
        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}
