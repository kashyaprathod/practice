import java.util.*;
public class menu4 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Palindrome number");
		System.out.println("2) perfect number");
		System.out.println("Choose any one from the above menu: ");
		int choose = sc.nextInt();
		switch(choose){
		case 1: 
			System.out.println("Eneter a number:");
			int no = sc.nextInt();
			int safe = no;
			int reverse = 0;
			while(safe>0){
				int digit = safe%10;
				reverse *= 10;
				reverse += digit;
				safe = safe/10;
			}
			if(reverse == no){
				System.out.println(no + " is palindrome nmuber.");
			}else{
				System.out.println(no + " is not a plaindrome number");
			}
			break;
		
		case 2: 
			System.out.println("Enter a number: ");
			int no1 = sc.nextInt();
			int safe1 = no1;
			int sum = 0;
			for(int i =1;i<no1;i++){
				if(no1%i == 0){
					sum += i;
				}
			}
			
			if(sum == no1){
				System.out.println(no1 + " is a perfect number.");
			}else{
				System.out.println(no1 + " is not a perfect number.");
			}
		}
	}
}
