package src.main.java;

public class InputConsole {
    
    
    public static void main(String[] args) {
        Menu();    
    }
    
    
    private static void Menu(){
        try {
            System.out.println("1- Find Uppercase in text.\n2- Find Uppercase or Digit or Special character in text.");
            int num = CTools.AskForNumber("function");
            FunctionPick(num);
        } catch (Exception e) {
            CTools.WriteRed("Not valid value.");
            Menu();
        }
    }
    
    private static void FunctionPick(int num){
        switch (num) {
            case 1:
            try {
                String text =  CTools.AskForText("input");
                int numN =  CTools.AskForNumber("N");
                String result = CharService.FindUppercase(text, numN);
                
                var count = CharService.Count(result);
                
                CTools.WriteGreen("Result: " + result);               
                CTools.WriteBlue(count);
                
                Menu();
            } catch (Exception e) {
                CTools.WriteRed("Not valid value.");
                FunctionPick(num);
            }        
            break;
            
            case 2:
            try {
                String text =  CTools.AskForText("input");
                int numN =  CTools.AskForNumber("N");
                String result = CharService.FindUppercaseNumberSpecial(text, numN);
                
                var count = CharService.Count(result);
                
                CTools.WriteGreen("Result: " + result);
                CTools.WriteBlue(count);
                
                Menu();
            } catch (Exception e) {
                CTools.WriteRed("Not valid value.");
                FunctionPick(num);
            }
            break;
            
            default:
            CTools.WriteRed("Not valid value.");
            Menu();
            break;
        }
    }
    
}
