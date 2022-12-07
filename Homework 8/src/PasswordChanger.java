
// author: Alisha Meena Gursahaney
// computing id: amg9zd
// date: 11/17/21

public class PasswordChanger implements PWCInterface {
	
	@Override
	public boolean containsDigit (String password) {
		// base case
		if (password.isEmpty()) {
			return false;
		}
		if (Character.isDigit(password.charAt(0))) {
			return true;
		}
		
		return containsDigit(password.substring(1));
	}
	
	@Override
	public boolean equalsOld (String oldPassword, String newPassword) {
		// base case
		if (oldPassword.isEmpty() && newPassword.isEmpty()) {
			return true;
		}
		// base case 2: if different lengths, then they are not equal
		if (oldPassword.length() != newPassword.length()) {
			return false;
		}
		if(oldPassword.length() == newPassword.length() && oldPassword.charAt(0) == newPassword.charAt(0)) {
			return equalsOld(oldPassword.substring(1), newPassword.substring(1));
		}
		else {
			return false;
		}
		
	}
	
	@Override
	public boolean reverseOfOld(String oldPassword, String newPassword) {
		// base case
        if(oldPassword.isEmpty() && newPassword.isEmpty()) {
            return true; 
        }
        if(oldPassword.charAt(0) == newPassword.charAt(newPassword.length()-1))
        	// recursion calls itself
        	return reverseOfOld(oldPassword.substring(1), newPassword.substring(0, newPassword.length()-1));
        else {
        	return false;
        }
	}
	
	@Override
	public int numberDifferences(String oldPassword, String newPassword) {
		// base case
		if (oldPassword.isEmpty() && newPassword.isEmpty()) {
			return 0;
		}
		// base case 2: return character differences if one is empty
		if (!oldPassword.isEmpty() && newPassword.isEmpty() || oldPassword.isEmpty() && !newPassword.isEmpty()) {
			return Math.abs(oldPassword.length() - newPassword.length());
		}
		// base case 3: if they are equal, referencing recursive method equalsOld
		if(equalsOld(oldPassword, newPassword)) {
			return 0;
		}
		if(oldPassword.charAt(0) == newPassword.charAt(0)) {
			return 0 + numberDifferences(oldPassword.substring(1), newPassword.substring(1));
		}
		else {
			return 1 + numberDifferences(oldPassword.substring(1), newPassword.substring(1));
			}
		}
       
	
	@Override
	public boolean differentEnough(String oldPassword, String newPassword, int quality) {
		// non recursive so no base cases
		if (numberDifferences(oldPassword, newPassword) >= quality) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	@Override
	public boolean validPasswordChange(String oldPassword, String newPassword) {
		int quality = oldPassword.length() / 2;
		if (containsDigit(newPassword) && !equalsOld(oldPassword, newPassword) && !reverseOfOld(oldPassword,newPassword) && numberDifferences(oldPassword,newPassword) >= quality) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		PasswordChanger password = new PasswordChanger();
        // Testing 
		
		System.out.println("containsDigit Testing");
		System.out.println(password.containsDigit("abc1")); // true
		System.out.println(password.containsDigit("abc")); // false
		System.out.println(password.containsDigit("hello1myname")); // true
		System.out.println(password.containsDigit("abcdefg")); // false
		
		System.out.println("\nequalsOld Testing");
		System.out.println(password.equalsOld("same", "same")); //true
		System.out.println(password.equalsOld("old", "new")); //false
		System.out.println(password.equalsOld("abcdef123", "abcdef123")); //true
		System.out.println(password.equalsOld("differentlength", "oops1")); //false
		
		System.out.println("\nreverseOfOld Testing");
		System.out.println(password.reverseOfOld("cake", "ekac")); // true
		System.out.println(password.reverseOfOld("old", "new")); // false
		System.out.println(password.reverseOfOld("car", "rac")); // true
		System.out.println(password.reverseOfOld("tree", "notthereverse")); // false
		
		System.out.println("\nnumberDifferences Testing");
		System.out.println(password.numberDifferences("abc1", "abc2")); // n = 1
		System.out.println(password.numberDifferences("hello", "hello")); // n = 0 (base case)
		System.out.println(password.numberDifferences("a", "bcdef")); // n = 5
		System.out.println(password.numberDifferences("12345", "1")); // n = 4
		System.out.println(password.numberDifferences("123abc", "456abc")); // n = 3
		
		System.out.println("\ndifferentEnough Testing");
		System.out.println(password.differentEnough("abc", "def", 2)); // true
		System.out.println(password.differentEnough("abcd", "abc", 3)); // false
		System.out.println(password.differentEnough("hellomynameisalisha", "hellomynameis", 5)); // true
		System.out.println(password.differentEnough("hellomynameisalisha", "hellomynameis", 10)); // false
		
		System.out.println("\nvalidPasswordChange Testing");
		System.out.println(password.validPasswordChange("old", "new")); // false, no digit
		System.out.println(password.validPasswordChange("same", "same")); // false, fails equalsOld
		System.out.println(password.validPasswordChange("cake", "ekac")); // false, fails reverseOfOld
		System.out.println(password.validPasswordChange("1234", "1256")); // true
		System.out.println(password.validPasswordChange("old", "new1")); // true
	}
	
}
	
