import java.util.*;
public class numbers16 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int no = sc.nextInt();
		int safe = no;
		int end = safe%10;
		
		if(end == 7 || no%7 == 0){
			System.out.println(no + " is a buzz number.");
		}else{
			System.out.println(no + " is not a buzz number.");
		}
	}
}
