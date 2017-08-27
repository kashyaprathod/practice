public class Smallest{
    public static void small(int a, int b, int c){
    if(a<b && a<c){
        System.out.println("Smallest number is "+ a);
    }else if(b<a && b<c){
        System.out.println("Smallest is "+b);
        
    }else{
        System.out.println("Smallest is "+c );
    }
    }
}