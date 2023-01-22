package src.main.java;

import java.util.List;
import java.util.Scanner;

public class CTools {
    private static Scanner scan = new Scanner(System.in);
    private static final String ColorRed = "\u001B[31m";
    private static final String ColorWhite = "\u001B[37m";
    private static final String ColorGreen = "\u001B[32m";
    private static final String ColorBlue = "\u001B[34m";
    
    
    public static String AskForText(String title) {
        System.out.println( String.format("Please enter %s text:", title) );
        String input_text = scan.nextLine();
        
        return input_text;
    }
    
    public static int AskForNumber(String title) {
        System.out.println( String.format("Please enter %s number:", title) );
        String input_text = scan.nextLine();
        
        try {
            int num = Integer.parseInt(input_text);
            return num;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static void WriteRed(String text) {
        System.out.println(ColorRed + text + ColorWhite); 
    }
    
    public static void WriteGreen(String text) {
        System.out.println(ColorGreen + text + ColorWhite); 
    }
    
    public static void WriteBlue(String text) {
        System.out.println(ColorBlue + text + ColorWhite); 
    }
    
    public static void WriteBlue(List<CharCount> counts){
        for (CharCount cc : counts) {
            WriteBlue(CharCount.toString(cc));
        }
    }
    
    public static void Write(String text) {
        System.out.println(text); 
    }
    
    public static void Write(List<CharCount> counts){
        for (CharCount cc : counts) {
            Write(CharCount.toString(cc));
        }
    }
}
