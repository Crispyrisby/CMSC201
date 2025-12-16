/* 

 * Class: CMSC201  

 * Instructor: Grigoriy Grinberg

 * Description: This is a JUnit class that tests the string class's length, charAt, substring, and indexOf methods. 

 * Due: 12/15/25 

 * I pledge that I have completed the programming assignment independently. 

   I have not copied the code from a student or any source. 

   I have not given my code to any student. 

   Print your Name here: Alex Nizeyimana 

*/ 

package chapter6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class StringTest {

	//
	@Before
    public void setUp() throws Exception {
        System.out.println("Running the String Test");
    }
	
    //Tests length method
    @Test
    public void testLength() {

        String emptyString = ""; // this is for an empty string 
        assertEquals(0, emptyString.length());
    }

    //Tests charAt method
    @Test
    public void testCharAt() {

    	String word = "Java";
    	assertEquals('J', word.charAt(0));
    	assertEquals('v', word.charAt(2));
    }
    
    //Tests substring method
    @Test
    public void testSubstring() {

        String subString = "Hello World";
        String first = subString.substring(0);
        String second = subString.substring(6);

        assertEquals("Hello", first.substring(0, 5));
        assertEquals("World", second);

    }

  
    //Tests indexOf method
    @Test
    public void testIndexOf() {
    	String indexString = "Aluminium";
    	assertEquals(3,indexString.indexOf('m'));

    }



    

}