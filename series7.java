package series;
import java.util.*;
public class series7 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n: ");
		int n= sc.nextInt();
		int a = 0;
		int b =1 ;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=n;i++){
			c = a+b;
			a=b;
			b=c;
			
			System.out.println(c);
		}
	}
	
}
