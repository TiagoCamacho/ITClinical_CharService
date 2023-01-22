package src.main.java;

import java.util.List;

public class CharCount {
    public String Char; 
    public int Count;
    
    public CharCount(String character, int count){
        Char = character;
        Count = count;
    }
    
    public CharCount(Character character, Long count){
        Char = Character.toString(character);
        Count = count.intValue();
    }
    
    public static String toString(CharCount count){
        String result = count.Char + " = " + count.Count;
        return result;
    }
    
    public static String toString(List<CharCount> count){
        String result = "";
        for (CharCount cc : count) {
            result = result + cc.Char + cc.Count;
        }
        return result;
    }
}
