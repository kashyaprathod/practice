public class PrimeNumber{
    public static void check(int n){
        int a;
        boolean flag= true;
        for(a=2;a<=n/2;a++){
            if(n % a == 0){
                flag = false;
                break;
            }
        }
        if(flag == true)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n +" is not a prime number");
        
    }
}