package exercises;

import java.util.HashMap;
import java.util.Map;


public class CountingCharacters {

    public static void main(String[] args) {

        String quote = "If the product of two terms is zero then common sense says at least one of the two terms " +
        "has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        quote = quote.toLowerCase();

        char[] charInString = quote.toCharArray();

        Map<Character, Integer> characterCounts = new HashMap<Character, Integer>();
        // Loop over the characters in the sentence
        for(char character : charInString) {

            //System.out.println(character);

            if(!Character.isLetter((character))){
                continue;
            }

            if(!characterCounts.containsKey(character)) {
                characterCounts.put(character, 1);
            }
            else {
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
        }
        for(Map.Entry<Character, Integer> entry: characterCounts.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }


}
