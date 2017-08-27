public class Myclass2{
    long greatest(long a, long b){
        long c;
        if(a>b){
            c=a;
        }else{
            c=b;
        }
        return c;
    }
    void test(){
        long g;
        g = greatest(4,7);
        System.out.println("The graetest number is: "+g);
    }
}