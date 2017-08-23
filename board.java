import java.util.*;
public class board {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=15;i++){
			for(int j=i;j<15;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
