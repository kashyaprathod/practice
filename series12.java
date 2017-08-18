package series;
import java.util.*;
public class series12 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			double k = Math.pow(i, 2) - 1;
			System.out.println(k);
		}
	}
	
}
