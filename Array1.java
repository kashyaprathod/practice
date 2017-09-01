import java.util.*;
public class Array1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x[] = new int[5];
        int sum=0;
        int greatest=0;
        int smallest=9;
        System.out.println("Enter 5 elements of array: ");
        for(int i=0;i<5;i++){
            x[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            sum += x[i];
        }
        for(int i=0;i<5;i++){
            if(x[i]>0){
                greatest = x[i];
            }
            if(x[i]<smallest){
                smallest = x[i];
            }
        }
        System.out.println("sum = "+sum);
        System.out.println(" max = "+greatest);
        System.out.println("min = "+smallest);
        for(int i=0;i<5;i++){
            int sq = (int)Math.pow(x[i],2);
            System.out.println(x[i]+"\t"+sq);
        }
    }
    
}