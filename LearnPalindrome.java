package assignment1;

public class LearnPalindrome {
	public static void main(String[] args) {
		
		int a = 1001;
		int b = 0;
		int rem;
		int orgNum = a;
		
		while(a>0) {
			rem = a%10;
			b = (b*10)+rem;
			a=a/10;
			}
		if(orgNum==b) {
			System.out.println(orgNum+ " is a palindrome");
		}
		else {
			System.out.println(orgNum+ " is not a palindrome");
		}
	}

}
