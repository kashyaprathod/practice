public class numbers14 {
	public static void main(String args[]) {
		String primeNo = "";
		int j = 0;
		int LastPrime = 1;
		System.out.println("Twin Primes are:");
		for (int i = 1; i < 200; i++) {
			for (j = 2; j <=i; j++) {
			   if (i % j == 0) {
			   break;
			   }
			}
			if (i == j) {
			   primeNo += i + " ";
			   if ((i - LastPrime) == 2) {
			   System.out.println("("+(i-2)+","+i+")");
			   }
			   LastPrime = i;
			}
		}
		System.out.println("Prime Numbers are: " + primeNo);
	}
}
