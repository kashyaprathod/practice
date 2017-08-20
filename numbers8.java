import java.util.*;
public class numbers8 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		int safe = no;
		int square = (int)Math.pow(no,2);
		int count = 0;
		while(safe>0){
			int digit = safe%10;
			count++;
			safe = safe/10;
		}
		
		int end = square % (int)Math.pow(10, count);
		
		if(end == no){
			System.out.println(no + " is a automorphic number.");
		}else{
			System.out.println(no + " is not a automorphic number.");
		}
	}
}
