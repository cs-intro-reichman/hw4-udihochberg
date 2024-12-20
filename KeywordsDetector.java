public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    public static String lowerCase(String str) {
        String newStr = "";
        char charToAdd;
    
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
    
            if (currentChar >= 'A' && currentChar <= 'Z') {
                charToAdd = (char) (currentChar + 32); 
            } 
            else {charToAdd = currentChar;}
    
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

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {

        for (int i = 0; i < sentences.length; i++)
        {
            for (int j = 0; j < keywords.length; j++)
            {
                if (contains(lowerCase(sentences[i]), lowerCase(keywords[j]))) {System.out.println(sentences[i]);  
            }
        }
    }
}
}