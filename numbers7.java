import java.util.*;
public class numbers7 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		int safe = no;
		int fact = 1;
		int sum = 0;
		while(safe>0){
			int digit = safe%10;
			fact = 1;
			for(int i=1;i<=digit;i++){
				fact *= i;
			}
			sum += fact;
			safe = safe/10;
		}
		
		if(sum == no){
			System.out.println(no + " is a special number.");
		}else{
			System.out.println(no + " is a specail number.");
		}
	}
}
