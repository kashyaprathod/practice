import java .util.*;
public class Selection_sort1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char small;
        char temp;
        int place;
        System.out.println("Enter 5 alphabets: ");
        char ch[] = new char[5];
        for(int i=0;i<5;i++){
            ch[i] = sc.next().charAt(0);
        }
        System.out.println("Unsorted array");
        for(int i=0;i<5;i++){
            System.out.print(ch[i] + " ");
        }
        for(int i=0;i<ch.length-1;i++){
            small = ch[i];
            place =i;
            
            for(int j=i+1;j<ch.length;j++){
                if(ch[j]<small){
                    small = ch[j];
                    place = j;
                }
            }
            temp = ch[i];
            ch[i] = ch[place];
            ch[place] = temp;
        }
        //printing sorted array//
        System.out.println();
        System.out.println("Sorted array:");
        for(int i=0;i<5;i++){
            System.out.print(ch[i] + " " );
        }
    }
}