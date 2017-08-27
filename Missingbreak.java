public class Missingbreak{
    public static void Test(int month_no){
        switch(month_no){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println ("This month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.prinln("This month has 30 days");
                break;
            case 2:
                System.out.println("This month has 28 days");
                break;
            default:
                System.out.println("Invalid month number");
        }//end of switch 
    }//end of function
}//end of class //