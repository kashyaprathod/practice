public class DigitSum{
    public static void calculateDigitsum(long num){
        int s = 0, a;
        long temp = num;
        do{
            a = (int)num%10;
            s += a;
            num /= 10;
        }while(num > 0);
        System.out.println(s);
    }
}