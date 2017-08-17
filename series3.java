package series;
import java.util.*;
public class series3 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter start of range: ");
		int start = sc.nextInt();
		System.out.println("eneter end of range: ");
		int end  = sc.nextInt();
		
		System.out.println("squares in range: ");
		for(int i = start;i<=end;i++){
			System.out.println("Square of "+ i + " is " + Math.pow(i, 2));
		}
		
		System.out.println("cubes in range: ");
		for(int i =start;i<=end; i++){
			System.out.println("cube of " +i+ " is "+ Math.pow(i, 3));
		}
	}

}
