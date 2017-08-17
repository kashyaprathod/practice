package series;
import java.util.*;
public class series5 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n: ");
		int n = sc.nextInt();
		int x=0;
		for(int i=0;i<n;i++){
            x = x*10+1;
            System.out.print(x + "\t");
        }

	}

}
