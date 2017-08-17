package series;
import java.util.*;
public class series2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter start of range: ");
		int start = sc.nextInt();
		System.out.println("enter end of range: ");
		int end = sc.nextInt();
		
		System.out.println("even numbers in range are: ");
		
		if(start%2 == 0){
			
			for(int i=start; i<=end;i+=2){
				System.out.println(i);
			}
		}else{
			
			for(int i=start+1;i<=end;i+=2){
				System.out.println(i);
			}
		}
		
		System.out.println("odd numbers between range are: ");
		
		if(start%2 != 0){
			for(int i= start;i<=end;i+=2){
				System.out.println(i);
			}
		}else{
			
			for(int i = start+1;i<=end;i+=2){
				System.out.println("i");
			}
		}
	}
}