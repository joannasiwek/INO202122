/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.seclasses5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jsiwek
 */
public class SuperAdditionTest {
    
    public SuperAdditionTest() {
    }

    @Test
    public void testSuperaddition() {
        System.out.println("superaddition");
        String a = "1";
        String b = "2";
        String expResult = "3";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testSuperaddition2() {
        System.out.println("superaddition");
        String a = "1";
        String b = "a";
        String expResult = "1a";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testSuperaddition3() {
        System.out.println("superaddition");
        String a = "3";
        String b = "2";
        String expResult = "5";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    @Test
    public void testSuperaddition4() {
        System.out.println("superaddition");
        String a = "3";
        String b = "b";
        String expResult = "3b";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test
    public void testSuperaddition5() {
        System.out.println("superaddition");
        String a = "312";
        String b = "2";
        String expResult = "3122";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuperaddition6() {
        System.out.println("superaddition");
        String a = "7";
        String b = "7";
        String expResult = "49";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuperaddition7() {
        System.out.println("superaddition");
        String a = "9";
        String b = "9";
        String expResult = "81";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
	
	    @Test
    public void testSuperaddition8() {
        System.out.println("superaddition");
        String a = "4";
        String b = "2";
        String expResult = "16";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuperaddition9() {
        System.out.println("superaddition");
        String a = "6";
        String b = "2";
        String expResult = "36";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }


    @Test
    public void testSuperaddition10() {
        System.out.println("superaddition");
        String a = "4";
        String b = "4";
        String expResult = "Hamilton";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuperaddition11() {
        System.out.println("superaddition");
        String a = "3";
        String b = "3";
        String expResult = "Verstappen";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void testSuperaddition12() {
        System.out.println("superaddition");
        String a = "1";
        String b = "2";
        String expResult = "3";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void testSuperaddition13() {
        System.out.println("superaddition");
        String a = "2";
        String b = "3";
        String expResult = "5";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuperaddition14() {
        System.out.println("superaddition");
        String a = "3";
        String b = "6";
        String expResult = "Nine";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuperaddition15() {
        System.out.println("superaddition");
        String a = "2";
        String b = "6";
        String expResult = "Eight";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuperaddition16() {
        System.out.println("superaddition");
        String a = "21";
        String b = "37";
        String expResult = "fifty-eight";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuperaddition17() {
        System.out.println("superaddition");
        String a = "45";
        String b = "32";
        String expResult = "seven-seven";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void testSuperaddition18() {
        System.out.println("superaddition");
        String a = "0xF";
        String b = "0xF";
        String expResult = "0x1E";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void testSuperaddition19() {
        System.out.println("superaddition");
        String a = "007";
        String b = "002";
        String expResult = "011";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
}
