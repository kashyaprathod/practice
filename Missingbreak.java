public class missingbreak{
    public static void daysofmonth(int month){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
            System.out.println("this month has 31 months");
            case 2:
            System.out.println("this month has 28 days");
            case 6:
            case 8:
            case 10:
            System.0ut.println("this month has 30 days");
            default:
            System.out.println("invalid month");
        }
    }
}