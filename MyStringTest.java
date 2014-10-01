import static org.junit.Assert.*;

import org.junit.Test;


public class MyStringTest {

    //fail("Not yet implemented");

    @Test
    public void testCharAtValid() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals('c', m.charAt(2));
    }

    @Test
    public void testCharAtNotValid() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals('b', m.charAt(2));
    }

    @Test
    public void testCharAtOutOfBoundsPositive() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(' ', m.charAt(12));
    }

    @Test
    public void testCharAtOutOfBoundsNegative() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(' ', m.charAt(-1));
    }

    @Test
    public void testCharAtWhitespace() {
        MyString m = new MyString(new char [] {'a', 'b', ' ', 'd', 'e'});
        assertEquals(' ', m.charAt(2));
    }

    @Test
    public void testContainsCharFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.containsChar('c'));
    }

    @Test
    public void testContainsCharNotFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(false, m.containsChar('f'));
    }

    @Test
    public void testContainsCharIgnoreCaseFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.containsChar('C'));
    }

    @Test
    public void testContainsCharIgnoreCaseNotFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.containsChar('F'));
    }

    @Test
    public void testCopy() {

    }

    @Test
    public void testStarsWithCharFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.startsWithChar('a'));
    }

    @Test
    public void testStartsWithCharNotFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(false, m.startsWithChar('z'));
    }

    @Test
    public void testEndsWithCharFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.endsWithChar('a'));
    }

    @Test
    public void testEndsWithCharNotFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(false, m.endsWithChar('z'));
    }

    @Test
    public void testFirstIndexOfFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(0, m.firstIndexOf('a'));
    }

    @Test
    public void testFirstIndexOfNotFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(-1, m.firstIndexOf('z'));
    }

    @Test
    public void testLastIndexOfFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'a'});
        assertEquals(4, m.lastIndexOf('a'));
    }

    @Test
    public void testLastIndexOfNotFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'a'});
        assertEquals(-1, m.lastIndexOf('z'));
    }

    @Test
    public void testIndexOfFromFound() {

    }

    @Test
    public void testIndexOfFromNotFound() {

    }

    @Test
    public void testToCharArray() {

    }

    @Test
    public void testLength() {

    }

    @Test
    public void testReplaceFirstInstanceCharFound() {

    }

    @Test
    public void testReplaceFirstInstanceCharNotFound() {

    }

    @Test
    public void testReplaceLastInstanceCharFound() {

    }

    @Test
    public void testReplaceLastInstanceCharNotFound() {

    }

    @Test
    public void testReplaceAllCharFound() {

    }

    @Test
    public void testReplaceAllCharNotFound() {

    }

    @Test
    public void testAccessToUppercaseMyString() {

    }

    @Test
    public void testAccessToUppercaseMyStringAlreadyUppercase() {

    }

    @Test
    public void testAccessToLowercaseMyString() {

    }

    @Test
    public void testAccessToLowercaseMyStringAlreadyUppercase() {

    }

    @Test
    public void testMutateToUppercaseMyString() {

    }

    @Test
    public void testMutateToLowercaseMyString() {

    }

    @Test
    public void testAccessToUppercaseChars() {

    }

    @Test
    public void testAccessToLowercaseChars() {

    }

    @Test
    public void testMutateToUppercaseChars() {

    }

    @Test
    public void testMutateToLowercaseChars() {

    }

    @Test
    public void testToString() {

    }

    @Test
    public void test() {

    }
}
