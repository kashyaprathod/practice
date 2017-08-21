import java.util.*;
public class numbers18 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = sc.nextInt();
		int safe = no;
		int lastdigit = no%10;
		int n = 1;
		int count = 0;
		while(safe>0){
			int digit = safe%10;
			count++;
			if(digit == 0){
				n = digit;
			}
			safe = safe/10;
		}
		int firstdigit = no / (int)Math.pow(10, count-1);
		if(n == 0 || lastdigit == 0 && firstdigit != 0){
			System.out.println(no + " is a duck number");
		}else{
			System.out.println(no + " is not a duck number.");
		}
	}
}
