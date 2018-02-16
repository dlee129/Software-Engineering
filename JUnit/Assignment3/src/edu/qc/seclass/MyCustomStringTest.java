package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }
    
    /*
     * First Test provided by Instructor
     * It tests the given string to count the Number of numbers
     * and the expected output value should be 7
     */
    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }
    /*
     * Second Test is another small test to check
     * The expected output value should be 4
     */
    @Test
    public void testCountNumbers2() {
    	mycustomstring.setString("P13453 g1v3 m3 the bleach!");
        assertEquals(4, mycustomstring.countNumbers());
    }

    /*
     * Third Test is to test for NullPointerException
     * Given string is null and therefore should return null
     */
    @Test(expected = NullPointerException.class)
    public void testCountNumbers3() {
    	mycustomstring.setString(null);
        assertEquals(0, mycustomstring.countNumbers());
    }

    /*
     * Fourth Test is to test for empty strings
     * Given string is empty and therefore should return 0 
     */
    @Test
    public void testCountNumbers4() {
    	mycustomstring.setString("");
        assertEquals(0, mycustomstring.countNumbers());
    }

    /*
     * Fifth Test is to test one string without spaces
     * With the given string, expected value should return 5
     */
    @Test
    public void testCountNumbers5() {
    	mycustomstring.setString("a1b2c3d4e5");
        assertEquals(5, mycustomstring.countNumbers());
    }
    
    /*
     * Sixth Test is to test string with 1 character in it
     * String has 1 digit in it
     * Expected value returned is 1
     */
    
    @Test
    public void testCountNumbers6() {
    	mycustomstring.setString("2");
        assertEquals(1, mycustomstring.countNumbers());
    }

    /*
     * First Test provided by Instructor
     * It will test the given string to get every Nth character from the string
     * Expected output is "d33p md1  i51,it"
     */
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    /*
     * Second Test provided by Instructor
     * It will test the given string to get every Nth character from the string
     * Expected output is "'bt t0 6snh r6rh"
     */
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    /*
     * Third Test tests a shorter string
     * Expected return is "143gv 3tebec!"
     */
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
    	mycustomstring.setString("P13453 g1v3 m3 the bleach!");
        assertEquals("143gv 3tebec!", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    /*
     * Fourth Test tests a shorter string
     * Expected return is "P35 13 m h lah"
     */
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
    	mycustomstring.setString("P13453 g1v3 m3 the bleach!");
        assertEquals("P35 13m h lah", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    /*
     * Fifth Test tests an empty string
     * Expected return is empty string
     */
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    	mycustomstring.setString("");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, true));
    }

    /*
     * Sixth Test tests an empty string
     * Expected return is empty string
     */
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    	mycustomstring.setString("");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, false));
    }
    
    /*
     * Seventh Test tests a string with methods with illegal parameter values
     * Expected return is IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    	mycustomstring.setString("I wish I could fly!");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false));
    }

    /*
     * Eighth Test tests a string with methods with illegal parameter values
     * Expected return is IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    	mycustomstring.setString("I wish I could fly!");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-1, false));
    }

    /*
     * Ninth Test tests a string with value null
     * Expected return is null
     */
    @Test(expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
    	mycustomstring.setString(null);
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    /*
     * Tenth Test tests a string with value null
     * Expected return is null
     */
    @Test(expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
    	mycustomstring.setString(null);
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    /*
     * Eleventh Test tests a short string
     * Expected return is " ihIcudfy"
     */
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
    	mycustomstring.setString("I wish I could fly!");
        assertEquals(" ihIcudfy", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    /*
     * Twelfth Test tests a short string
     * Expected return is " pIo iC7"
     */
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
    	mycustomstring.setString("I hope I dont fail CS370.");
        assertEquals(" pIo iC7", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    /*
     * Thirteenth Test tests a short string
     * Expected return is "oInaC0"
     */
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
    	mycustomstring.setString("I hope I dont fail CS370.");
        assertEquals("oInaC0", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, false));
    }

    /*
     * Fourteenth Test tests a short string "Hello"
     * Expected return is empty since it is calling out of the index of the string length
     */
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
    	mycustomstring.setString("Hello");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(6, false));
    }

    /*
     * First Test provided by Instructor
     * It will test to turn all digits in the selected positions in Capitalized words
     * Expected output is "I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?"
     */
    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    /*
     * Second Test provided by Instructor
     * It will test to turn all digits in the selected positions in Capitalized words
     * Expected output is "I'd bThreettThreer put s0me d161ts in this 5tr1n6, right?"
     */
    @Test
    public void testConvertDigitsToNamesInSubstring2() {
    	mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(5, 10);
        assertEquals("I'd bThreettThreer put s0me d161ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    /*
     * Third test for convertDigitsToNames
     * With the given string
     * Expected output is "POneThreeFourFiveThree gOnev3 m3 the bleach!"
     */
    @Test
    public void testConvertDigitsToNamesInSubstring3() {
    	mycustomstring.setString("P13453 g1v3 m3 the bleach!");
        mycustomstring.convertDigitsToNamesInSubstring(1,10);
        assertEquals("POneThreeFourFiveThree gOnev3 m3 the bleach!", mycustomstring.getString());
    }

    /*
     * Fourth test for convertDigitsToNames
     * Given parameter values will throw a IAE
     * Expected output is IAE message
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring4() {
    	mycustomstring.setString("P13453 g1v3 m3 the bleach!");
        mycustomstring.convertDigitsToNamesInSubstring(10,1);
        assertEquals("", mycustomstring.getString());
    }

    /*
     * Fifth test for convertDigitsToNames
     * Given parameter values will throw a MIOOB
     * Expected output is MIOOB message
     */
    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring5() {
    	mycustomstring.setString("I hope I dont fail CS370.");
        mycustomstring.convertDigitsToNamesInSubstring(0,5);
        assertEquals("", mycustomstring.getString());
    }

    /*
     * Sixth test for convertDigitsToNames
     * Given parameter values will throw a MIOOB
     * Expected output is MIOOB message
     */
    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring6() {
    	mycustomstring.setString("I hope I dont fail CS370.");
        mycustomstring.convertDigitsToNamesInSubstring(1,50);
        assertEquals("", mycustomstring.getString());
    }

    /*
     * Seventh test for convertDigitsToNames
     * Given parameter values will throw a NPE
     * Expected output is NPE message
     */
    @Test(expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring7() {
    	mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(1,10);
        assertEquals("", mycustomstring.getString());
    }

    /*
     * Eighth test for convertDigitsToNames
     * Expected output is "I hope I dont fail CSThreeSevenZero."
     */
    @Test
    public void testConvertDigitsToNamesInSubstring8() {
    	mycustomstring.setString("I hope I dont fail CS370.");
        mycustomstring.convertDigitsToNamesInSubstring(20,24);
        assertEquals("I hope I dont fail CSThreeSevenZero.", mycustomstring.getString());
    }

}
