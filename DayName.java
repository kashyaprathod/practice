public class DayName{
    void printEquivalentDayNumber(int day_no){
        if(day_no==1)
            System.out.println("Monday");
        if(day_no==2)
            System.out.println("Tuesday");
        if(day_no==3)
            System.out.println("Wednesday");
        if(day_no==4)
            System.out.println("Thursday");
        if(day_no==5)
            System.out.println("Friday");
        if(day_no==6)
            System.out.println("Saturday");
        if(day_no==7)
            System.out.println("Sunday");
        if(day_no<1 || day_no>7)
            System.out.println("Invalid day number");
    }
}