import java.util.Scanner;

public class SpoonerismGenerator {

    public static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().toLowerCase();
    }

    public static int vowelIndex(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; 
    }

    public static void run() {

        String word1 = getWord("Enter Word 1: ");
        String word2 = getWord("Enter Word 2: ");
        
        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 == -1 || vowelIndex2 == -1 || vowelIndex1 == 0 || vowelIndex2 == 0) {
            System.out.println("\n" + word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
 
            String consonants1 = "";
            String vowels1 = "";
            for (int i = 0; i < word1.length(); i++) {
                if (i < vowelIndex1) {
                    consonants1 += word1.charAt(i); 
                } else {
                    vowels1 += word1.charAt(i);    
                }
            }

            String consonants2 = "";
            String vowels2 = "";
            for (int i = 0; i < word2.length(); i++) {
                if (i < vowelIndex2) {
                    consonants2 += word2.charAt(i); 
                } else {
                    vowels2 += word2.charAt(i);   
                }
            }

            String spoonerizedWord1 = consonants2 + vowels1;
            String spoonerizedWord2 = consonants1 + vowels2;

            System.out.println("\n" + word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2 + ".");
        }
    }

    public static void main(String[] args) {
        run();
    }
}
