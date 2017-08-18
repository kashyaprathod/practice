package series;
import java.util.*;
public class series9 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n: ");
		int n = sc.nextInt();
		int sum =0;
		for(int j=1;j<=n;j++){
			for(int i=1;i<=j;i++){
				sum += i;
			}
		}
			System.out.println(sum);
	}
	

}
