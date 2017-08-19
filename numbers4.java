import java.util.*;
public class numbers4 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing factorial of a number.");
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=no;i++){
			fact *= i;
		}
		System.out.println("Factorial of " + no + " is " + fact);
	}
}
