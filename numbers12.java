import java.util.*;
public class numbers12 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		int original  = no;
		int reverse = 0;
		
		while(no>0){
			int digit = no%10;
			reverse *= 10;
			reverse += digit;
			no = no/10;
		}
		if(reverse == original){
			System.out.println(original + " is a palindrome number.");
		}else{
			System.out.println(original + " is not a palindrome number.");
		}
		
	}
}
