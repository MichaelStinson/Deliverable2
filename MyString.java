//  This is a simple String class that is initialized based on in input character array (char[] chars)
//
//  There are various methods associated with the MyString class, of which descriptions can be found
//  below. Most important is likely the toString function which converts the input to a string.


public class MyString {
    char [] chars;

    public MyString (char [] c) {
        chars = c;
    }

    public char charAt (int i) {
        //  INPUT: integer index
        //  OUTPUT: the character at that index, if exists

        if (i > 0 && i < chars.length)
            return chars[i];
        else
            return ' ';
    }

    public boolean containsChar (char c) {
        //  INPUT:  a characater "char c"
        //  OUTPUT: true if the character is in char[] chars, false otherwise

        for (char i : chars) {
            if (i == c) return true;
        }
        return false;
    }

    public boolean containsCharIgnoreCase (char c) {
        //  INPUT:  a characater "char c"
        //  OUTPUT: true if the character is in char[] chars (irrespective of case), false otherwise

        for (char i : chars) {
            if (Character.toLowerCase(i) == Character.toLowerCase(c))
                return true;
        }
        return false;
    }

    public MyString copy () {
        //  INPUT:  N/A
        //  OUTPUT: a new (shallow) copy of the MyString class

        return new MyString (chars);
    }

    public boolean startsWithChar (char c) {
        //  INPUT:  a character "char c" 
        //  OUTPUT: true if the first index of char[] chars is c, false otherwise

        if (chars[0] == c) return true;
        return false;
    }

    public boolean endsWithChar (char c) {
        //  INPUT:  a character "char c" 
        //  OUTPUT: true if the last index of char[] chars is c, false otherwise

        if (chars[chars.length-1] == c) return true;
        return false;
    }

    public int firstIndexOf (char c) {
        //  INPUT:  a character (char c)
        //  OUTPUT: the index of the first occurrence of c in char[] chars 

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) return i;
        }
        return -1;
    }

    public int lastIndexOf (char c) {
        //  INPUT:  a character (char c)
        //  OUTPUT: the index of the last occurrence of c in char[] chars 

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == c) return i;
        }
        return -1;
    }

    public int indexOfFrom (char c, int j) {
        //  INPUT:  character to look for (char c) and index to start at (int j)
        //  OUTPUT: index of first match to c (where index >= j), -1 if no match is found

        for (int i = j; i < chars.length; i++){
            if (chars[i] == c) return i;
        }
        return -1;
    }

    public char [] toCharArray () {
        //  INPUT:  N/A
        //  OUTPUT: the character array representation of the string in MyString 

        return chars;
    }

    public int length () {
        //  INPUT:  N/A
        //  OUTPUT: The length of the string

        return chars.length;
    }

    public MyString replaceFirstInstance (char toBeReplaced, char changeTo) {
        //  INPUT:  Two characters; one to replace, one to be replaced
        //  OUTPUT: The string-version of the char[] chars member of MyString, with the first instance of
        //          "char toBeReplaced" replaced by "char changeTo"

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == toBeReplaced) {
                chars[i] = changeTo;
                return new MyString (chars);
            }
        }
        return new MyString (chars);
    }

    public MyString replaceLastInstance (char toBeReplaced, char changeTo) {
        //  INPUT:  Two characters; one to replace, one to be replaced
        //  OUTPUT: The string-version of the char[] chars member of MyString, with the last instance of
        //          "char toBeReplaced" replaced by "char changeTo"

        for (int i = chars.length-1; i >= 0; i--) {
            if (chars[i] == toBeReplaced) {
                chars[i] = changeTo;
                return new MyString (chars);
            }
        }
        return new MyString (chars);
    }

    public MyString replaceAll (char toBeReplaced, char changeTo) {
        //  INPUT:  Two characters; one to replace, one to be replaced
        //  OUTPUT: The string-version of the char[] chars member of MyString, with all instances of 
        //          "char toBeReplaced" replaced by "char changeTo"

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == toBeReplaced) {
                chars[i] = changeTo;
            }
        }
        return new MyString (chars);
    }

    public MyString accessToUppercaseMyString () {
        //  INPUT:  N/A
        //  OUTPUT: char[] chars, converted to an all upper-case string

        char [] ret = chars;
        for (int i = 0; i < chars.length; i++) {
            ret[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString(ret);
    }

    public MyString accessToLowercaseMyString () {
        //  INPUT:  N/A
        //  OUTPUT: char[] chars, converted to an all lower-case string

        char [] ret = chars;
        for (int i = 0; i < chars.length; i++) {
            ret[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString(ret);
    }

    public void mutateToUppercaseMyString () {
        //  INPUT: N/A
        //  OUTPUT: N/A
        //
        //  This function modifies the char[] chars member of MyString to be upper-case.

        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
    }

    public void mutateToLowercaseMyString () {
        //  INPUT: N/A
        //  OUTPUT: N/A
        //
        //  This function modifies the char[] chars member of MyString to be lowercase.

        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
    }

    public char [] accessToUppercaseChars () {
        //  INPUT:  N/A
        //  OUTPUT: The char[] chars member of MyString, converted to upper-case

       char [] ret = chars;
        for (int i = 0; i < chars.length; i++) {
            ret[i] = Character.toUpperCase(chars[i]);
        }
        return ret;
    }

    public char [] accessToLowercaseChars () {
        //  INPUT:  N/A
        //  OUTPUT: The char[] chars member of MyString, converted to lower-case

        char [] ret = chars;
        for (int i = 0; i < chars.length; i++) {
            ret[i] = Character.toLowerCase(chars[i]);
        }
        return ret;
    }

    public void mutateToUppercaseChars () {
        //  INPUT: N/A
        //  OUTPUT: N/A
        //
        //  This function modifies the char[] chars member of MyString to be upper-case.

        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
    }

    public void mutateToLowercaseChars () {
        //  INPUT: N/A
        //  OUTPUT: N/A
        //
        //  This function modifies the char[] chars member of MyString to be lowercase.

        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
    }

    public String toString () {
        //  INPUT: N/A
        //  OUTPUT: the character array as a string

        return new String (chars);
    }

    public boolean equals (MyString m) {
        // Return false if MyStrings are not same length
        if (this.length() != m.length()) return false;

        // Otherwise, test char arrays for equality
        char [] thisChars = this.toCharArray();
        char [] mChars = m.toCharArray();
        for (int i = 0; i < this.length(); i++) {
            if (thisChars[i] != mChars[i]) return false;
        }

        return true;
    }

    public boolean equalsIgnoreCase (MyString m) {
        // Return false if MyStrings are not same length
        if (this.length() != m.length()) return false;

        // Otherwise, test char arrays for equality
        char [] thisChars = this.toCharArray();
        char [] mChars = m.toCharArray();
        for (int i = 0; i < this.length(); i++) {
            if (Character.toLowerCase(thisChars[i]) != Character.toLowerCase(mChars[i])) return false;
        }

        return true;
    }
}
