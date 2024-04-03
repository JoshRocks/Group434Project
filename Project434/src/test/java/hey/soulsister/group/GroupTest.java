/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hey.soulsister.group;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Math;

/**
 *
 * @author rocka
 */
public class GroupTest {
    
     Group instance;
    
    public GroupTest() {
    }
    
    @Before
    public void setUp() {
        instance = new Group();
    }

    /**
     * Test of getGroupMembers method, of class Group.
     */
    @Test
    public void testGetGroupMembers() {
        System.out.println("getGroupMembers");
        
        String expResult = "Joshua Rockamore\nShadiya Thomas\nDjordje Marinkovic\n";
        String result = instance.getGroupMembers();
        assertEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class Group.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int num1 = 5;
        int num2 = 10;
        int expResult = num1 * num2;
        int result = instance.multiply(num1, num2);
        assertEquals(expResult, result);
    }

    /**
     * Test of power method, of class Group.
     */
    @Test
    public void testPower() {
        System.out.println("power");
        int num1 = 4;
        int num2 = 4;
        int expResult = (int)Math.pow(num1, num2);
        int result = instance.power(num1, num2);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Group.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int num1 = 256;
        int num2 = 4;
        int expResult = num1 / num2;
        int result = instance.divide(num1, num2);
        assertEquals(expResult, result);
    }
    
}
