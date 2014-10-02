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
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        assertEquals(-1, m.firstIndexOf('z'));
    }

    @Test
    public void testLastIndexOfFound() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        assertEquals(8, m.lastIndexOf('E'));
    }

    @Test
    public void testLastIndexOfNotFound() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        assertEquals(-1, m.lastIndexOf('z'));
    }

    @Test
    public void testIndexOfFromFound() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);

        assertEquals(8, m.indexOfFrom('E', 6));
        assertEquals(5, m.indexOfFrom('E', 0));
    }

    @Test
    public void testIndexOfFromNotFound() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        assertEquals(-1, m.indexOfFrom('q', 0));
    }

    @Test
    public void testToCharArray() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);

        char[] returnedArray = m.toCharArray();
        assertEquals(initialArray, returnedArray);
    }

    @Test
    public void testLength() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);

        assertEquals(15, m.length());
    }

    @Test
    public void testReplaceFirstInstanceCharFound() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceFirstInstance('E', 'Q');

        assertEquals(m.charAt(5), 'Q');
        assertNotEquals(m.charAt(8), 'Q');
    }

    @Test
    public void testReplaceFirstInstanceCharNotFound() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceFirstInstance('Q', 'Z');

        assertEquals(-1, m.indexOfFrom('Z', 0));
    }

    @Test
    public void testReplaceLastInstanceCharFound() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceLastInstance('E', 'Q');

        assertNotEquals(m.charAt(5), 'Q');
        assertEquals(m.charAt(8), 'Q');
    }

    @Test
    public void testReplaceLastInstanceCharNotFound() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceLastInstance('Q', 'Z');

        assertEquals(-1, m.indexOfFrom('Z', 0));
    }

    @Test
    public void testReplaceAllCharFound() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceAll('E', 'Q');

        assertEquals(m.charAt(5), 'Q');
        assertEquals(m.charAt(8), 'Q');
        assertEquals(-1, m.indexOfFrom('E', 0));
    }

    @Test
    public void testReplaceAllCharNotFound() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);
        m.replaceAll('Q', 'Z');

        assertEquals(-1, m.indexOfFrom('Q', 0));
        assertEquals(-1, m.indexOfFrom('Z', 0));
    }

    @Test
    public void testAccessToUppercaseMyString() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString testString = m.accessToUppercaseMyString();
        assertEquals("ABCDE", testString.toString());
    }

    @Test
    public void testAccessToUppercaseMyStringAlreadyUppercase() {
        MyString m = new MyString(new char [] {'A', 'B', 'C', 'D', 'E'});
        MyString testString = m.accessToUppercaseMyString();
        assertEquals("ABCDE", testString.toString());
    }

    @Test
    public void testAccessToLowercaseMyString() {
        MyString m = new MyString(new char [] {'A', 'B', 'C', 'D', 'E'});
        MyString testString = m.accessToLowercaseMyString();
        assertEquals("abcde", testString.toString());
    }

    @Test
    public void testAccessToLowercaseMyStringAlreadyUppercase() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString testString = m.accessToLowercaseMyString();
        assertEquals("abcde", testString.toString());
    }

    @Test
    public void testMutateToUppercaseMyString() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        m.mutateToUppercaseMyString();
        assertEquals("ABCDE", m.toString());
    }

    @Test
    public void testMutateToLowercaseMyString() {
        MyString m = new MyString(new char [] {'A', 'B', 'C', 'D', 'E'});
        m.mutateToLowercaseMyString();
        assertEquals("abcde", m.toString());
    }

    @Test
    public void testAccessToUppercaseChars() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        char [] testChars = m.accessToUppercaseChars();
        assertArrayEquals(new char [] {'A', 'B', 'C', 'D', 'E'}, testChars);
    }

    @Test
    public void testAccessToLowercaseChars() {
        MyString m = new MyString(new char [] {'A', 'B', 'C', 'D', 'E'});
        char [] testChars = m.accessToLowercaseChars();
        assertArrayEquals(new char [] {'a', 'b', 'c', 'd', 'e'}, testChars);    	
    }

    @Test
    public void testMutateToUppercaseChars() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        m.mutateToUppercaseChars();
        assertArrayEquals(new char [] {'A', 'B', 'C', 'D', 'E'}, m.toCharArray());
    }

    @Test
    public void testMutateToLowercaseChars() {
        MyString m = new MyString(new char [] {'A', 'B', 'C', 'D', 'E'});
        m.mutateToLowercaseChars();
        assertArrayEquals(new char [] {'a', 'b', 'c', 'd', 'e'}, m.toCharArray());
    }

    @Test
    public void testToString() {
        char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
        MyString m = new MyString(initialArray);

        assertEquals("I LOVE TESTING!", m.toString());
    }

    @Test
    public void testEqualsValid() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true,m.equals(n));
    }

    @Test
    public void testEqualsInvalidMatch() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'z', 'b', 'c', 'd', 'e'});
        assertNotEquals(true,m.equals(n));
    }

    @Test
    public void testEqualsInvalidLength() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'a', 'b', 'c'});
        assertNotEquals(true,m.equals(n));
    }

    @Test
    public void testEqualsIgnoreCaseValid() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'A', 'b', 'C', 'd', 'e'});
        assertEquals(true,m.equalsIgnoreCase(n));
    }

    @Test
    public void testEqualsIgnoreCaseInvalidMatch() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'Z', 'V', 'B', 'd', 'e'});
        assertNotEquals(true,m.equalsIgnoreCase(n));
    }

    @Test
    public void testEqualsIgnoreCaseInvalidLength() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        MyString n = new MyString(new char [] {'a', 'b', 'c'});
        assertNotEquals(true,m.equalsIgnoreCase(n));
    }

    @Test
    public void testLengthCalled() {
        MyString n = new MyString(new char [] {'a', 'b', 'c'});

        MyString mockMyString = Mockito.mock(MyString.class);
        Mockito.when(mockMyString.length()).thenReturn(3);
        Mockito.when(mockMyString.toCharArray()).thenReturn(new char [] {'a', 'b', 'c'});

        n.equals(mockMyString);

        Mockito.verify(mockMyString).length();

    }

    @Test
    public void testToCharArrayCalled() {
        MyString n = new MyString(new char [] {'a', 'b', 'c'});

        MyString mockMyString = Mockito.mock(MyString.class);
        Mockito.when(mockMyString.length()).thenReturn(3);
        Mockito.when(mockMyString.toCharArray()).thenReturn(new char [] {'a', 'b', 'c'});

        n.equals(mockMyString);

        Mockito.verify(mockMyString).toCharArray();
    }

    @Test
    public void testEqualsMethodWhenEquals() {
        MyString n = new MyString(new char [] {'a', 'b', 'c'});

        MyString mockMyString = Mockito.mock(MyString.class);
        Mockito.when(mockMyString.length()).thenReturn(3);
        Mockito.when(mockMyString.toCharArray()).thenReturn(new char [] {'a', 'b', 'c'});

        assertTrue(n.equals(mockMyString));
    }

    @Test
    public void testEqualsMethodWhenNotEquals() {
        MyString n = new MyString(new char [] {'a', 'b', 'c'});

        MyString mockMyString = Mockito.mock(MyString.class);
        Mockito.when(mockMyString.length()).thenReturn(3);
        Mockito.when(mockMyString.toCharArray()).thenReturn(new char [] {'a', 'b', 'Q'});

        assertFalse(n.equals(mockMyString));
    }
}
