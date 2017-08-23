import java.util.*;
public class menu7 {
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("1) Fibonacci");
		System.out.println("2) sum of the digits of an integer" );
		System.out.println("Choose any one: ");
		int choose = sc.nextInt();
		
		switch(choose){
		
		case 1:
			System.out.println("Enter n: ");
			int n = sc.nextInt();
			int a=0;
			int b=1;
			int c;
			System.out.println(a);
			System.out.println(b);
			for(int i = 1;i<=n;i++){
				c = a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
			break;
		
		case 2:
			System.out.println("Enter a number: ");
			int no = sc.nextInt();
			int safe = no;
			int sum=0;
			 while(safe>0){
				 int digit = safe%10;
				 safe = safe/10;
				 sum += digit;
			 }
			 System.out.println("Sum of entered digit is: "+ sum);
			 break;
			 
		default:
			System.out.println("Invalid entery");

		}
	}
}
