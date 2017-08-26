public class Leap{
    public static void checkLeapOrNot(int y ){
        if(y%100 == 0){
            if(y%400 == 0)
                System.out.println("It is a leap year.");
            else
                System.out.println("It is not a leap year.");
        }else{
            if(y%4 == 0)
                System.out.println("It is a leap year");
            else
                System.out.println("It is not a leap year");
        
        }
    }
}