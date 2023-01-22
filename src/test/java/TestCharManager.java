package src.test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import src.main.java.CharCount;
import src.main.java.CharService;

public class TestCharManager {
    
    private static String _input_test = "ITCLiNicAl";
    private static String _input_test_special_char = "!tCL1Nical";
    
    //FindUppercase
    @Test
    public void FindUppercase_NEqual1_ITCLNA() {
        String expect = "ITCLNA";
        String actual = CharService.FindUppercase(_input_test, 1);
        
        assertEquals("Testing FindUppercase N = 1",expect, actual);
    }
    
    @Test
    public void FindUppercase_NEqual2_TLN() {
        String expect = "TLN";
        String actual = CharService.FindUppercase(_input_test, 2);
        
        assertEquals("Testing FindUppercase N = 2",expect, actual);
    }
    
    @Test
    public void FindUppercase_NEqual3_CNA() {
        String expect = "CNA";
        String actual = CharService.FindUppercase(_input_test, 3);
        
        assertEquals("Testing FindUppercase N = 3",expect, actual);
    }
    
    @Test
    public void FindUppercase_NEqual4_L() {
        String expect = "L";
        String actual = CharService.FindUppercase(_input_test, 4);
        
        assertEquals("Testing FindUppercase N = 4",expect, actual);
    }
    
    @Test
    public void FindUppercase_NEqual100_EmptyString() {
        String expect = "";
        String actual = CharService.FindUppercase(_input_test, 100);
        
        assertEquals("Testing FindUppercase N = 100",expect, actual);
    }
    
    @Test
    public void FindUppercase_NEqualMinus1_EmptyString() {
        String expect = "";
        String actual = CharService.FindUppercase(_input_test, -1);
        
        assertEquals("Testing FindUppercase N = -1",expect, actual);
    }
    
    @Test
    public void FindUppercase_NEqual0_EmptyString() {
        String expect = "";
        String actual = CharService.FindUppercase(_input_test, 0);
        
        assertEquals("Testing FindUppercase N = 0",expect, actual);
    }
    
    @Test
    public void FindUppercase_NEqual0EmptyString_EmptyString() {
        String expect = "";
        String actual = CharService.FindUppercase("", 0);
        
        assertEquals("Testing FindUppercase N = 0", expect, actual);
    }
    
    
    //FindUppercaseNumberSpecial
    @Test
    public void FindUppercaseNumberSpecial_NEqual1_ExclamationCL1N() {
        String expect = "!CL1N";
        String actual = CharService.FindUppercaseNumberSpecial(_input_test_special_char, 1);
        
        assertEquals("Testing FindUppercaseNumberSpecial N = 1",expect, actual);
    }
    
    @Test
    public void FindUppercaseNumberSpecial_NEqual2_LN() {
        String expect = "LN";
        String actual = CharService.FindUppercaseNumberSpecial(_input_test_special_char, 2);
        
        assertEquals("Testing FindUppercaseNumberSpecial N = 2",expect, actual);
    }
    
    @Test
    public void FindUppercaseNumberSpecial_NEqual3_CN() {
        String expect = "CN";
        String actual = CharService.FindUppercaseNumberSpecial(_input_test_special_char, 3);
        
        assertEquals("Testing FindUppercaseNumberSpecial N = 3",expect, actual);
    }
    
    @Test
    public void FindUppercaseNumberSpecial_NEqual4_L() {
        String expect = "L";
        String actual = CharService.FindUppercaseNumberSpecial(_input_test_special_char, 4);
        
        assertEquals("Testing FindUppercaseNumberSpecial N = 4",expect, actual);
    }
    
    @Test
    public void FindUppercaseNumberSpecial_NEqual100_EmptyString() {
        String expect = "";
        String actual = CharService.FindUppercaseNumberSpecial(_input_test_special_char, 100);
        
        assertEquals("Testing FindUppercaseNumberSpecial N = 100",expect, actual);
    }
    
    @Test
    public void FindUppercaseNumberSpecial_NEqualMinus1_EmptyString() {
        String expect = "";
        String actual = CharService.FindUppercaseNumberSpecial(_input_test_special_char, -1);
        
        assertEquals("Testing FindUppercaseNumberSpecial N = -1",expect, actual);
    }
    
    @Test
    public void FindUppercaseNumberSpecial_NEqual0_EmptyString() {
        String expect = "";
        String actual = CharService.FindUppercaseNumberSpecial(_input_test_special_char, 0);
        
        assertEquals("Testing FindUppercaseNumberSpecial N = 0",expect, actual);
    }
    
    //CharServiceCount
    @Test
    public void Count_ICLINCAL() {
        List<CharCount> expect = new ArrayList<>();
        expect.add(new CharCount("I", 2));
        expect.add(new CharCount("C", 2));
        expect.add(new CharCount("L", 2));
        expect.add(new CharCount("N", 1));
        expect.add(new CharCount("A", 1));
        
        List<CharCount> actual = CharService.Count("ICLINCAL");
        
        assertEquals(CharCount.toString(expect), CharCount.toString(actual));
    }
    
    @Test
    public void Count_IICAL_And_Specials() {
        List<CharCount> expect = new ArrayList<>();
        expect.add(new CharCount("I", 2));
        expect.add(new CharCount(".", 1));
        expect.add(new CharCount("C", 1));
        expect.add(new CharCount("A", 1));
        expect.add(new CharCount("!", 2));
        expect.add(new CharCount("L", 1));
        
        List<CharCount> actual = CharService.Count("I.ICA!L!");
        
        assertEquals(CharCount.toString(expect), CharCount.toString(actual));
    }
    
    @Test
    public void Count_IIAL_ToFail() {
        List<CharCount> expect = new ArrayList<>();
        expect.add(new CharCount("I", 2));
        expect.add(new CharCount("A", 2));
        
        List<CharCount> actual = CharService.Count("IIAL");
        
        Assert.assertNotEquals(CharCount.toString(expect), CharCount.toString(actual));
    }
}
