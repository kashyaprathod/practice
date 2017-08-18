package series;
import java.util.*;
public class series8 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 2;
		int d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		for(int i=1;i<=n;i++){
			d = (a+b+c);
			a=b;
			b=c;
			c=d;
			System.out.println(d);
		}
	}
	

}
