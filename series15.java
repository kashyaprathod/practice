package series;
import java.util.*;
public class series15 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n: ");
		int n = sc.nextInt();
		System.out.println("enter x: ");
		int x = sc.nextInt();
		int fact;
		int y;
		double sum =0;
		for(int j=0;j<=n;j++){
			fact = 1;
			for( y=1;y<=j+1;y++){
				fact *= y;
			}
			if(j==0){
				sum += (double) 1;
			}else{
				sum += (double) (x+j)/fact;
			}
		}
		System.out.println(sum);
		
	}
}
