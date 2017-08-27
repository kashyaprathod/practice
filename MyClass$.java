public class MyClass${
     void convert(int no_days){
            int years = no_days/365;
            int tp = no_days%365;
            int months = no_days/30;
            int days = 1;
            
            System.out.println("no of years is :"+ years );
            System.out.println("no of months is :"+ months);
            System.out.println("no of days is: "+ days);
            System.out.println(tp);
        }
        public static void main(String args[]){
            MyClass$ obj = new MyClass$();
            obj.convert(2048);
        }
}