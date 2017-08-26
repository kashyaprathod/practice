public class DigitsSum{
    public static void main(int num){
        int original = num;
        int sum = 0;
        while(num > 0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("Your enterd number is: "+original);
        System.out.println(sum);
    }
}