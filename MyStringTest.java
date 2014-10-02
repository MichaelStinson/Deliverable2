import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;


public class MyStringTest {

    //fail("Not yet implemented");

    @Test
    public void testCharAtValid() {
        // This unit test verifies the functionality of MyString.charAt(char c) on valid input

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals('c', m.charAt(2));
    }

    @Test
    public void testCharAtNotValid() {
        // This unit test verifies the functionality of MyString.charAt(char c)

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertNotEquals('b', m.charAt(2));
    }

    @Test
    public void testCharAtOutOfBoundsPositive() {
        // This unit test verifies the functionality of MyString.charAt(char c) on invalid input (out of bounds)
        // Should return ' ' if invalid index is given

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(' ', m.charAt(12));
    }

    @Test
    public void testCharAtOutOfBoundsNegative() {
        // This unit test verifies the functionality of MyString.charAt(char c) on invalid input (out of bounds)
        // Should return ' ' if invalid index is given

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(' ', m.charAt(-1));
    }

    @Test
    public void testCharAtWhitespace() {
        // This unit test verifies the functionality of MyString.charAt(char c) on valid input
        // Should return ' ' as MyString.charAt(2)

        MyString m = new MyString(new char [] {'a', 'b', ' ', 'd', 'e'});
        assertNotEquals(' ', m.charAt(2));
    }

    @Test
    public void testContainsCharFound() {
        // This unit test verifies the functionality of MyString.containsChar(char c) on valid input
        // Looks for 'c' in MyString m, should find it

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.containsChar('c'));
    }

    @Test
    public void testContainsCharNotFound() {
        // This unit test verifies the functionality of MyString.containsChar(char c) on valid but not found input
        // Looks for 'f' in MyString m, should not find it

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(false, m.containsChar('f'));
    }

    @Test
    public void testContainsCharIgnoreCaseFound() {
        // This unit test verifies the functionality of MyString.containsChar(char c) on valid but not found input (should respect Case)
        // Looks for 'C' or 'c' in MyString m, should not find 'c'

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.containsCharIgnoreCase('C'));
    }

    @Test
    public void testContainsCharIgnoreCaseNotFound() {
        // This unit test verifies the functionality of MyString.containsCharIgnoreCase(char c) on valid and not found input
        // Looks for 'F' or 'f' in MyString m, should not find it

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertNotEquals(true, m.containsCharIgnoreCase('F'));
    }

    @Test
    public void testCopy() {
        // This unit test verifies the functionality of MyString.copy(char c)
        // Copies MyString m into MyString newMyString. Checks if they are equal using MyString.Equals(MyString m)

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString newMyString = m.copy();
        assertEquals(true, m.equals(newMyString));
    }

    @Test
    public void testStartsWithCharFound() {
        // This unit test verifies the functionality of MyString.startsWithChar(char c)
        // Looks for 'a' at the start, and should find it

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.startsWithChar('a'));
    }

    @Test
    public void testStartsWithCharNotFound() {
        // This unit test verifies the functionality of MyString.startsWithChar(char c)
        // Looks for 'z' at the start, and should not find it

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(false, m.startsWithChar('z'));
    }

    @Test
    public void testEndsWithCharFound() {
        // This unit test verifies the functionality of MyString.endsWithChart(char c)
        // Looks for 'e' at the end, and should find it
        
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.endsWithChar('e'));
    }

    @Test
    public void testEndsWithCharNotFound() {
        // This unit test verifies the functionality of MyString.endsWithChar(char c)
        // Looks for 'z' at the end, and should not find it

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(false, m.endsWithChar('z'));
    }

    @Test
    public void testFirstIndexOfFound() {
        // This unit test verifies the functionality of MyString.firstIndexOf(char c)
        // Looks for the first index of 'a', and should find it to be index=0

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(0, m.firstIndexOf('a'));
    }

    @Test
    public void testFirstIndexOfNotFound() {
        //
        // This unit test verifies the functionality of firstIndexOf() when the input is not present
    	
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        assertEquals(-1, m.firstIndexOf('z'));
    }

    @Test
    public void testLastIndexOfFound() {
        //
        // This unit test verifies the functionality of lastIndexOf() when the input is present
    	
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        assertEquals(8, m.lastIndexOf('E'));
    }

    @Test
    public void testLastIndexOfNotFound() {
        //
        // This unit test verifies the functionality of lastIndexOf() when the input is not present
    	
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        assertEquals(-1, m.lastIndexOf('z'));
    }

    @Test
    public void testIndexOfFromFound() {
        //
        // This unit test verifies the functionality of indexOfFrom() when the input is present
    	
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);

        assertEquals(8, m.indexOfFrom('E', 6));
        assertEquals(5, m.indexOfFrom('E', 0));
    }

    @Test
    public void testIndexOfFromNotFound() {
        //
        // This unit test verifies the functionality of indexOfFrom() when the input is not present

        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        assertEquals(-1, m.indexOfFrom('q', 0));
    }

    @Test
    public void testToCharArray() {
        //
        // This unit test verifies the functionality of toCharArray() when the input is present

        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);

        char[] returnedArray = m.toCharArray();
        assertEquals(initialArray, returnedArray);
    }

    @Test
    public void testLength() {
        //
        // This unit test verifies the functionality of length()

        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);

        assertEquals(15, m.length());
    }

    @Test
    public void testReplaceFirstInstanceCharFound() {
        //
        // This unit test verifies the functionality of replaceFirstInstance() when the input is present

        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceFirstInstance('E', 'Q');

        assertEquals(m.charAt(5), 'Q');
        assertNotEquals(m.charAt(8), 'Q');
    }

    @Test
    public void testReplaceFirstInstanceCharNotFound() {
        //
        // This unit test verifies the functionality of replaceFirstInstance() when the input is not present
    	
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceFirstInstance('Q', 'Z');

        assertEquals(-1, m.indexOfFrom('Z', 0));
    }

    @Test
    public void testReplaceLastInstanceCharFound() {
        //
        // This unit test verifies the functionality of replaceLastInstance() when the input is present
    	
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceLastInstance('E', 'Q');

        assertNotEquals(m.charAt(5), 'Q');
        assertEquals(m.charAt(8), 'Q');
    }

    @Test
    public void testReplaceLastInstanceCharNotFound() {
        //
        // This unit test verifies the functionality of replaceLastInstance() when the input is not present
    	
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceLastInstance('Q', 'Z');

        assertEquals(-1, m.indexOfFrom('Z', 0));
    }

    @Test
    public void testReplaceAllCharFound() {
        //
        // This unit test verifies the functionality of replaceAll() when the input is present
    	
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceAll('E', 'Q');

        assertEquals(m.charAt(5), 'Q');
        assertEquals(m.charAt(8), 'Q');
        assertEquals(-1, m.indexOfFrom('E', 0));
    }

    @Test
    public void testReplaceAllCharNotFound() {
        //
        // This unit test verifies the functionality of replaceAll() when the input is not present
    	
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceAll('Q', 'Z');

        assertEquals(-1, m.indexOfFrom('Q', 0));
        assertEquals(-1, m.indexOfFrom('Z', 0));
    }

    @Test
    public void testAccessToUppercaseMyString() {
        //
        // This unit test verifies the functionality of accessToUppercaseMyString() when the input is lower case
    	
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString testString = m.accessToUppercaseMyString();
        assertEquals("ABCDE", testString.toString());
    }

    @Test
    public void testAccessToUppercaseMyStringAlreadyUppercase() {
        //
        // This unit test verifies the functionality of accessToUppercaseMyString() when the input is already upper case
        MyString m = new MyString(new char [] {'A', 'B', 'C', 'D', 'E'});
        MyString testString = m.accessToUppercaseMyString();
        assertEquals("ABCDE", testString.toString());
    }

    @Test
    public void testAccessToLowercaseMyStringAlreadyUppercase() {
        //
        // This unit test verifies the functionality of accessToLowercaseMyString() when the input is already upper case
    	
        MyString m = new MyString(new char [] {'A', 'B', 'C', 'D', 'E'});
        MyString testString = m.accessToLowercaseMyString();
        assertEquals("abcde", testString.toString());
    }

    @Test
    public void testAccessToLowercaseMyString() {
        //
        // This unit test verifies the functionality of accessToLowercaseMyString() when the input is lower case

        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString testString = m.accessToLowercaseMyString();
        assertEquals("abcde", testString.toString());
    }

    @Test
    public void testMutateToUppercaseMyString() {
        //
        // This unit test verifies the functionality of mutateToLowercaseMyString()
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        m.mutateToUppercaseMyString();
        assertEquals("ABCDE", m.toString());
    }

    @Test
    public void testMutateToLowercaseMyString() {
        //
        // This unit test verifies the functionality of mutateToLowercaseMyString()
        MyString m = new MyString(new char [] {'A', 'B', 'C', 'D', 'E'});
        m.mutateToLowercaseMyString();
        assertEquals("abcde", m.toString());
    }

    @Test
    public void testAccessToUppercaseChars() {
    	//
        // This unit test verifies the functionality of accessToUppercaseChars()
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        char [] testChars = m.accessToUppercaseChars();
        assertArrayEquals(new char [] {'A', 'B', 'C', 'D', 'E'}, testChars);
    }

    @Test
    public void testAccessToLowercaseChars() {
    	//
        // This unit test verifies the functionality of accessToLowercaseChars()
        MyString m = new MyString(new char [] {'A', 'B', 'C', 'D', 'E'});
        char [] testChars = m.accessToLowercaseChars();
        assertArrayEquals(new char [] {'a', 'b', 'c', 'd', 'e'}, testChars);    	
    }

    @Test
    public void testMutateToUppercaseChars() {
    	//
        // This unit test verifies the functionality of mutateToUppercaseChars()
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        m.mutateToUppercaseChars();
        assertArrayEquals(new char [] {'A', 'B', 'C', 'D', 'E'}, m.toCharArray());
    }

    @Test
    public void testMutateToLowercaseChars() {
    	//
        // This unit test verifies the functionality of mutateToLowercaseChars()
        MyString m = new MyString(new char [] {'A', 'B', 'C', 'D', 'E'});
        m.mutateToLowercaseChars();
        assertArrayEquals(new char [] {'a', 'b', 'c', 'd', 'e'}, m.toCharArray());
    }

    @Test
    public void testToString() {
    	//
        // This unit test verifies the functionality of toString()
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);

        assertEquals("I LOVE TESTING!", m.toString());
    }

    @Test
    public void testEqualsValid() {
    	//
        // This unit test verifies the functionality of equals() when equal
    	
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true,m.equals(n));
    }

    @Test
    public void testEqualsInvalidMatch() {
    	//
        // This unit test verifies the functionality of equals() when not equal
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'z', 'b', 'c', 'd', 'e'});
        assertNotEquals(true,m.equals(n));
    }

    @Test
    public void testEqualsInvalidLength() {
    	//
        // This unit test verifies the functionality of equals() when different lengths
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'a', 'b', 'c'});
        assertNotEquals(true,m.equals(n));
    }

    @Test
    public void testEqualsIgnoreCaseValid() {
    	//
        // This unit test verifies the functionality of equalsIgnoreCase() when there are different cases
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'A', 'b', 'C', 'd', 'e'});
        assertEquals(true,m.equalsIgnoreCase(n));
    }

    @Test
    public void testEqualsIgnoreCaseInvalidMatch() {
    	//
        // This unit test verifies the functionality of equalsIgnoreCase() when there are completely different elements
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'Z', 'V', 'B', 'd', 'e'});
        assertNotEquals(true,m.equalsIgnoreCase(n));
    }

    @Test
    public void testEqualsIgnoreCaseInvalidLength() {
    	//
        // This unit test verifies the functionality of equalsIgnoreCase() when there are completely different lengths
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'a', 'b', 'c'});
        assertNotEquals(true,m.equalsIgnoreCase(n));
    }

    @Test
    public void testLengthCalled() {
    	//
        // This unit test verifies that the length method is called in .equals when inputs are the same (using mocking and stubbing)
        MyString n = new MyString(new char [] {'a', 'b', 'c'});

        MyString mockMyString = Mockito.mock(MyString.class);
        Mockito.when(mockMyString.length()).thenReturn(3);
        Mockito.when(mockMyString.toCharArray()).thenReturn(new char [] {'a', 'b', 'c'});

        n.equals(mockMyString);

        Mockito.verify(mockMyString).length();

    }

    @Test
    public void testToCharArrayCalled() {
    	//
        // This unit test verifies that the toCharArray method is called in .equals when things are of the same length (using mocking and stubbing)
        MyString n = new MyString(new char [] {'a', 'b', 'c'});

        MyString mockMyString = Mockito.mock(MyString.class);
        Mockito.when(mockMyString.length()).thenReturn(3);
        Mockito.when(mockMyString.toCharArray()).thenReturn(new char [] {'a', 'b', 'c'});

        n.equals(mockMyString);

        Mockito.verify(mockMyString).toCharArray();
    }

    @Test
    public void testEqualsMethodWhenEquals() {
    	//
        // This unit test verifies that the equals method works properly when inputs are equal (using mocking and stubbing)
        MyString n = new MyString(new char [] {'a', 'b', 'c'});

        MyString mockMyString = Mockito.mock(MyString.class);
        Mockito.when(mockMyString.length()).thenReturn(3);
        Mockito.when(mockMyString.toCharArray()).thenReturn(new char [] {'a', 'b', 'c'});

        assertTrue(n.equals(mockMyString));
    }

    @Test
    public void testEqualsMethodWhenNotEquals() {
    	//
        // This unit test verifies that the equals method works properly when inputs are not equal (using mocking and stubbing)
        MyString n = new MyString(new char [] {'a', 'b', 'c'});

        MyString mockMyString = Mockito.mock(MyString.class);
        Mockito.when(mockMyString.length()).thenReturn(3);
        Mockito.when(mockMyString.toCharArray()).thenReturn(new char [] {'a', 'b', 'Q'});

        assertFalse(n.equals(mockMyString));
    }
}
