
public class MyString {
	char [] chars;
	
	public MyString (char [] c) {
		chars = c;
	}
	
	public char charAt (int i) {
		if (i > 0 && i < chars.length)
			return chars[i];
		else
			return ' ';
	}
	
	public boolean containsChar (char c) {
		for (char i : chars) {
			if (i == c) return true;
		}
		return false;
	}
	
	public boolean containsCharIgnoreCase (char c) {
		for (Character i : chars) {
			if (Character.toLowerCase(i) == Character.toLowerCase(c))
				return true;
		}
		return false;
	}
	
	public MyString copy () {
		return new MyString (chars);
	}
	
	public boolean startsWithChar (char c) {
		if (chars[0] == c) return true;
		return false;
	}
	
	public boolean endsWithChar (char c) {
		if (chars[chars.length-1] == c) return true;
		return false;
	}
	
	public int firstIndexOf (char c) {
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == c) return i;
		}
		return -1;
	}
	
	public int lastIndexOf (char c) {
		for (int i = chars.length - 1; i >= 0; i--) {
			if (chars[i] == c) return i;
		}
		return -1;
	}
	
	public int indexOfFrom (char c, int j) {
		for (int i = j; i < chars.length; i++){
			if (chars[i] == c) return i;
		}
		return -1;
	}
	
	/*public MyString append (char [] c) {
		char [] ret = new char [chars.length+c.length];
		
	}
	
	public MyString append (MyString m) {
		
		
	}*/
	
	public char [] toCharArray () {
		return chars;
	}
	
	public int length () {
		return chars.length;
	}
	
	public MyString replaceFirstInstance (char toBeReplaced, char changeTo) {
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == toBeReplaced) {
				chars[i] = changeTo;
				return new MyString (chars);
			}
		}
		return new MyString (chars);
	}
	
	public MyString replaceLastInstance (char toBeReplaced, char changeTo) {
		for (int i = chars.length-1; i >= 0; i--) {
			if (chars[i] == toBeReplaced) {
				chars[i] = changeTo;
				return new MyString (chars);
			}
		}
		return new MyString (chars);
	}
	
	public MyString replaceAll (char toBeReplaced, char changeTo) {
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == toBeReplaced) {
				chars[i] = changeTo;
			}
		}
		return new MyString (chars);
	}
	
	public MyString accessToUppercaseMyString () {
		char [] ret = chars;
		for (int i = 0; i < chars.length; i++) {
			ret[i] = Character.toUpperCase(chars[i]);
		}
		return new MyString(ret);
	}
	
	public MyString accessToLowercaseMyString () {
		char [] ret = chars;
		for (int i = 0; i < chars.length; i++) {
			ret[i] = Character.toLowerCase(chars[i]);
		}
		return new MyString(ret);
	}
	
	public MyString mutateToUppercaseMyString () {
		for (int i = 0; i < chars.length; i++) {
			chars[i] = Character.toUpperCase(chars[i]);
		}
		return new MyString(chars);
	}
	
	public MyString mutateToLowercaseMyString () {
		for (int i = 0; i < chars.length; i++) {
			chars[i] = Character.toLowerCase(chars[i]);
		}
		return new MyString(chars);
	}
	
	public char [] accessToUppercaseChars () {
		char [] ret = chars;
		for (int i = 0; i < chars.length; i++) {
			ret[i] = Character.toUpperCase(chars[i]);
		}
		return ret;
	}
	
	public char [] accessToLowercaseChars () {
		char [] ret = chars;
		for (int i = 0; i < chars.length; i++) {
			ret[i] = Character.toLowerCase(chars[i]);
		}
		return ret;
	}
	
	public char [] mutateToUppercaseChars () {
		for (int i = 0; i < chars.length; i++) {
			chars[i] = Character.toUpperCase(chars[i]);
		}
		return chars;
	}
	
	public char [] mutateToLowercaseChars () {
		for (int i = 0; i < chars.length; i++) {
			chars[i] = Character.toLowerCase(chars[i]);
		}
		return chars;
	}
	
	public String toString () {
		return new String (chars);
	}
}
