package src.main.java;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class CharService {

    private static List<Character> Get(String text, int n){
        try {
            List<Character> char_list = new ArrayList<>();
            
            int i = n - 1;
            while (i < text.length() && n > 0) {
                char_list.add(text.charAt(i));              
                i = i + n;
            } 
            
            return char_list;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static List<CharCount> Count(String text) {
        List<CharCount> counts = new ArrayList<>();   
        List<Character> letters = new ArrayList<>();    
        
        for (char ch : text.toCharArray()) {
                     
            Long count = text.chars().filter(c -> c == ch).count();
            CharCount charCount = new CharCount(ch, count);
            
            if(!letters.contains(ch)) {
                counts.add(charCount);
                letters.add(ch);
            }
                    
        }
        
        return counts;
    }

    public static String FindUppercase(String text, int n) {
        List<Character> characters = Get(text, n);
        
        String uppercase = characters.stream().filter(c -> Character.isUpperCase(c)).map(String::valueOf).collect(Collectors.joining());
        
        return uppercase;
    }
    
    public static String FindUppercaseNumberSpecial(String text, int n) {
        List<Character> characters = Get(text, n);
        
        String uppercase = characters.stream().filter(c ->
        Character.isUpperCase(c) || Character.isDigit(c) || (!Character.isLetter(c) && !Character.isWhitespace(c) )
        ).map(String::valueOf).collect(Collectors.joining());
        
        return uppercase;
    }
}
