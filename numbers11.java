import java.util.*;
public class numbers11 {
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
		System.out.println("original number is: "+ original);
		System.out.println("Reverse number is: "+reverse);
	}
}
