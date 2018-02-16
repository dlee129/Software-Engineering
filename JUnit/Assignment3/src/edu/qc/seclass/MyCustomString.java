package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface{

	public String current;
	
	/**
	 * getString method implemented from MyCustomStringInterface class
	 * to retrieve the current string
	 * 
	 * Returns the current string. If the string is null, it should return null.
	 */
	@Override
	public String getString() {
		return current;
	}

	/**
	 * getString method implemented from MyCustomStringInterface class
	 * to set the current string to the parameter value passed
	 * 
	 * Sets the value of the current string.
	 */
	@Override
	public void setString(String string) {
		current = string;	
	}
	
	/**
	 * countNumbers method implemented from MyCustomStringInterface class
	 * 
	 * Returns the number of numbers in the current string, where a number is defined as a
     * contiguous sequence of digits.
	 */
	@Override
	public int countNumbers() {
		//throws NPE if current string is null
		if(current == null) {
			throw new NullPointerException("Current string is null");
		}
		//when current string is not null
		else {
			int count = 0;
			for(int i=0; i < current.length(); i++) {
				char check = current.charAt(i);
				if(Character.isDigit(check)) {
					while(Character.isDigit(check)) {
						i++;
						if(i>=current.length()) {
							break;
						}
						check = current.charAt(i);
					}//checks while it is an integer to count contiguous integers as one whole number
					count++;
				}
				else {
					//does nothing since letters are not being counted here
				}
			}//for loop that iterates through the current string
			return count;
		}//else when current string is not null
	}

	/**
	 * getEveryNthCharacterFromBeginningOrEnd method implemented from MyCustomStringInterface class
	 * 
	 * Returns a string that consists of all and only the characters in positions n, 2n, 3n, and
     * so on in the current string, starting either from the beginning or from the end of the
     * string. The characters in the resulting string should be in the same order and with the
     * same case as in the current string.
     *
     * If the current string is empty or has less than n characters, the method should return an
     * empty string.
	 */
	@Override
	public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
		//throws IAE when n is equal or less than 0 
		if(n <= 0) {
			throw new IllegalArgumentException("n cannot be less than or equal to 0.");
		}
		//throws NPE if current string is null
		else if(current == null && n > 0) {
			throw new NullPointerException("Current string is null.");
		}
		//now begins whether method starts from beginning of string or end of string when current string is not null
		else {
			String line = "";
			if(startFromEnd==false) {
				for(int i=1; i < current.length()+1; i++) {
					if(i*n > current.length()) {
						break;
					}//if in for
					else {
						line+=current.charAt(i*n-1);
					}//else in for
				}//for
			}//if outside of for
			//else when starting from end is true
			else {
				for(int i=0; i < current.length(); i++) {
					if((i+1)*n > current.length()) {
						break;
					}//if in for
					else {
						line=current.charAt(current.length() - (i+1)*n)+line;
					}//else in for
				}//for
			}
			return line;
		}
	}

	/**
	 * convertDigitsToNamesInSubstring method implemented from MyCustomStringInterface class
	 * 
	 * Replace the individual digits in the current string, between startPosition and endPosition
     * (included), with the corresponding English names of those digits, with the first letter
     * capitalized. The first character in the string is considered to be in Position 1.
     * Unlike for the previous method, digits are converted individually, even if contiguous.
	 */
	@Override
	public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
		//throws IAE if startPosition is greater than endPosition
		if(startPosition > endPosition) {
			throw new IllegalArgumentException("Start position cannot be greater than endPosition.");
		}
		//throws MIOOB if Positions are invalid indexes 
		else if(startPosition < 1 || startPosition > current.length() || endPosition < 1 || endPosition > current.length()) {
			throw new MyIndexOutOfBoundsException("Positions cannot be at 0 or past the string length.");
		}
		//throws NPE if current string is null
		else if(startPosition > 0 && endPosition > 0 && current == null) {
			throw new NullPointerException("Current string is null.");
		}
		/*
		 * After all the exceptions have been checked and the parameters pass
		 */
		else {
			String line = "";
			//the Capitalized word equivalents for the digits
			String []numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
			for(int i=0; i <current.length(); i++) {
				while(i>=startPosition-1 && i <endPosition) {
					char check = current.charAt(i);
					if(check == '0') {
						line+=numbers[0];
					}
					else if(check == '1') {
						line+=numbers[1];
					}
					else if(check == '2') {
						line+=numbers[2];
					}
					else if(check == '3') {
						line+=numbers[3];
					}
					else if(check == '4') {
						line+=numbers[4];
					}
					else if(check == '5') {
						line+=numbers[5];
					}
					else if(check == '6') {
						line+=numbers[6];
					}
					else if(check == '7') {
						line+=numbers[7];
					}
					else if(check == '8') {
						line+=numbers[8];
					}
					else if(check == '9'){
						line+=numbers[9];
					}
					else {
					line+=current.charAt(i);
					}
					i++;
				}
					line+=current.charAt(i);
			}//for 
			current = line;
		}
	}//convertDigitstoName method close
	
}//MyCustomString class