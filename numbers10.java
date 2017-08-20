import java.util.*;
public class numbers10 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: " );
		int no = sc.nextInt();
		int safe = no;
		int sum =0;
		while(safe>0){
			int digit = safe%10;
			int cube = (int)Math.pow(digit, 3);
			sum += cube;
			safe = safe/10;
		}
		
		if(sum == no){
			System.out.println(no + " is a Armstrong number.");
		}else{
			System.out.println(no + " is not a Armstrong number.");
		}
	}
}
