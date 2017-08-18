package series;
import java.util.*;
public class series13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sum=0;
		for(double i=1,j=2;i<=4;i+=2,j+=2){
			sum += (i/j);
		}
		System.out.println(sum);
		

	}

}
