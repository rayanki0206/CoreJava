package Sunday;

public class Pangram {
    
    public static boolean PangramCheck(String str) {

        boolean[] letterArray = new boolean[26];
//        char[] ch1=str1.toCharArray();
//        char[] ch2=str2.toCharArray();
        

        for (char ch : str.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {

                letterArray[ch - 'a'] = true;
            }
        }
        
        for (boolean Present : letterArray) {
            if (!Present) {
                return false; 
            }
        }
        
        return true; 
    }
    
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        
        if (PangramCheck(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}
