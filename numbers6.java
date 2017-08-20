import java.util.*;
public class numbers6 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		int safe = no;
		int sum = 0, product =1;
		while(safe>0){
			int digit = safe%10;
			 sum += digit;
			 product *= digit;
			 safe = safe/10;
		}
		int specialnumber = sum+product;
		
		if(specialnumber == no){
			System.out.println(no + " is a specail number");
		}else{
			System.out.println(no + " is not a special number");
		}
	}
}
