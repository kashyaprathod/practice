import java.util.*;
public class Temperature{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1) fahrenheit");
        System.out.println("1)celsius");
        System.out.println("Select any one from the above menu");
        char a = sc.next().charAt(0);
        switch(a){
            case 'f':
            System.out.println("you have selected fahrenheit");
            System.out.println("Enetr degree fahrenheit to convert to celsius");
            double f = sc.nextDouble();
            double c = 5/9*(f-32);
            System.out.println("degree celsius is: "+ c);
            break;
            
            case 'c':
            System.out.println("you have celsius");
            System.out.println("Enetr degree celsius to convert to fahrenheit");
            double cel = sc.nextDouble();
            double fah = 1.8*(cel+32);
            System.out.println("degree fahrenheit is: "+ fah);
            break;
            default:
            System.out.println("invalid input");
        }
    }
}