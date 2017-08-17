package series;
import java.util.*;
public class series4 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++){
			double num = Math.pow(2, i) + i;
			System.out.println(num);
		}
	}
}
