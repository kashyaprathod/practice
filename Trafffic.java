import java.util.Scanner;
public class Trafffic{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        char a =input.next().charAt(0);
        a = Character.toUpperCase(a);
        switch(a){
            case 'R':
                System.out.println("the colour is red");
                break;
            case 'G':
                System.out.println("the color is green");
                break;
            case 'Y':
                System.out.println("the color is yellow");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
}