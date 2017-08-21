import java.util.*;
public class numbers13 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		int square = (int)Math.pow(no, 2);
		int sum = 0;
		
		while(square>0){
			int digit = square%10;
			sum += digit;
			square = square/10;
		}
		
		if(sum == no){
			System.out.println(no + " is a neon number.");
		}else{
			System.out.println(no + " is not a neon number.");
		}
	}
}
