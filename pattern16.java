package practice;

public class pattern16 {
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=5;j>=1;j--){
				if(i==j&&j==i){
					System.out.print("@");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
