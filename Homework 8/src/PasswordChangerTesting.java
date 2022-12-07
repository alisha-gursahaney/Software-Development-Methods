
public class PasswordChangerTesting {
	public static void main(String[] args) {
        // Testing 
		System.out.println("containsDigit Testing");
		System.out.println(PasswordChanger.containsDigit("abc1")); // true
		System.out.println(PasswordChanger.containsDigit("abc")); // false
		
		System.out.println("\nequalsOld Testing");
		System.out.println(PasswordChanger.equalsOld("same", "same")); //true
		System.out.println(PasswordChanger.equalsOld("old", "new")); //false
		
		System.out.println("\nreverseOfOld Testing");
		System.out.println(PasswordChanger.reverseOfOld("cake", "ekac")); // true
		System.out.println(PasswordChanger.reverseOfOld("old", "new")); // false
		
		System.out.println("\nnumberDifferences Testing");
		System.out.println(PasswordChanger.numberDifferences("abc1", "abc2")); // n = 1
		System.out.println(PasswordChanger.numberDifferences("hello", "hello")); // n = 0 (base case)
		System.out.println(PasswordChanger.numberDifferences("a", "bcdef")); // n = 5
		
		System.out.println("\ndifferentEnough Testing");
		System.out.println(PasswordChanger.differentEnough("abc", "def", 2)); // true
		System.out.println(PasswordChanger.differentEnough("abcd", "abc", 3)); // false
		
		System.out.println("\nvalidPasswordChange Testing");
		System.out.println(PasswordChanger.validPasswordChange("old", "new")); // true
		System.out.println(PasswordChanger.validPasswordChange("same", "same")); // false
		System.out.println(PasswordChanger.validPasswordChange("cake", "ekac")); // false
		System.out.println(PasswordChanger.validPasswordChange("1234", "1256")); // true
	}
}
