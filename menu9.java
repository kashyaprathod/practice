import java.util.*;
public class menu9 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Term Deposit");
		System.out.println("2) Recurring Deposit");
		System.out.println("Choose any one from above: ");
		int choose  = sc.nextInt();
		
		switch(choose){
		
		case 1: 
			System.out.println("enter principle: ");
			int p = sc.nextInt();
			System.out.println("enter rate of interesr: ");
			int r = sc.nextInt();
			System.out.println("enter time period: ");
			int n = sc.nextInt();
			double a = p * 1 + (double)(r/100); 
			System.out.println("Maturity amount: "+a);
		}
	}
}
