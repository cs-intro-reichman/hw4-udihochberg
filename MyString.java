public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = "";
        char charToAdd;
    
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
    
            // Check if the character is an uppercase letter
            if (currentChar >= 'A' && currentChar <= 'Z') {
                charToAdd = (char) (currentChar + 32); // Correct conversion to lowercase
            } else {
                // Keep non-uppercase characters as is
                charToAdd = currentChar;
            }
    
            // Append the character to the result
            newStr += charToAdd;
        }
        return newStr;
    }

    public static boolean SimpleContain(String str1, String str2){
        int counter = 0;
        while (counter < str2.length())
        {
            if (str1.charAt(counter) != str2.charAt(counter)) { return false; }
            counter++;
        }
        return true;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        String newStr = str1;
        for (int i = 0; i < str1.length(); i++)
        {
            if (str2.length() > newStr.length()) {return false; }
            if (SimpleContain(newStr, str2)) { return true; }
            newStr = newStr.substring(1);
        }
        return false;
    }
}
