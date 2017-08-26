 
import java.util.*;
public class Employee {
    Scanner input = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    int pan;
    String name;
    double tax_income;
    double tax;
    void Employee(){
        pan = 0;
        name = "";
        tax_income = 0.0d;
        tax = 0.0d;
    }
    void input(){
        System.out.println("Enter your pan number");
        pan = input.nextInt();
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your income");
        tax_income = input.nextDouble();
    }
    void calc(){
        if(tax_income == 100000){
            tax =0;
        }
        if(tax_income >= 100001 && tax_income<=150000){
            
            tax = (tax_income - 100000)*0.1; 
        }
        if(tax_income >= 150001 && tax_income<=250000 ){
            tax  = (tax_income - 150000)*0.2 + 5000;
        }
        if(tax_income>250000){
            tax = (tax_income - 250000)*0.3+25000;
        }
    }
    void display(){
        System.out.println("pan number \t"+"Name \t"+"Tax_income \t"+"Tax");
        System.out.println(pan +"\t"+name+"\t"+tax_income+"\t"+tax);
    }
    public static void main(){
        Employee e1 = new Employee();
        e1.input();
        e1.calc();
        e1.display();
    }
    
}
