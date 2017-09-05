import java .util.*;
public class Selection_sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int small,place,temp;   //variables for sorting the array//
        System.out.println("Enter elements of array: ");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("unsorted array is equal to: ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i] + " " );
        }
        //selection sort//
        for(int i=0;i<arr.length-1;i++){
            small = arr[i];
            place =i;
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<small){
                    small = arr[j];
                    place = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[place];
            arr[place] = temp;
        }
        //printing sorted array//
        System.out.println();
        System.out.println("Sorted array:");
        for(int i=0;i<5;i++){
            System.out.print(arr[i] + " " );
        }
    }
}