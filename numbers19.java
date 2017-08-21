import java.util.*;
public class numbers19{
	public static boolean CheckPrime(int n){
		int count = 0;
			if(n == 1){
				return false;
			}
			for(int i =2;i<n;i++){
				count = 0;
				if(n%i == 0){
					count++;
				}
			}
			if(count == 0){
				return true;
			}else{
				return false;
			}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a nmuber: ");
		int no = sc.nextInt();
		int safe = no;
		int count = 0;
		int reverse = 0;
		while(safe>0){
			int digit = safe%10;
			reverse *= 10;
			reverse += digit;
			safe = safe/10;
		}
		if(CheckPrime(no) && CheckPrime(reverse)){
			System.out.println(no + " is a emirp number");
		}else{
			System.out.println(no + " is not a emirp number");
		}
	}
}
