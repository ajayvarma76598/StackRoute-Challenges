import java.util.*;
import java.lang.*;
public class Task9 {
    public static void main(String[] args){
        int currentday,noofdays,day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter current day of the week(1 for mon 2 for tue):");
        currentday=sc.nextInt();
        System.out.println("Enter the no.of days from today");
        noofdays=sc.nextInt();
        if(currentday+noofdays==0){
            System.out.println("Its a Monday");
        }
        day = ((currentday+noofdays)%7);
        switch (day){
            case 1:
            System.out.println("Its a Monday");
            break;
            case 2:
            System.out.println("Its a Tuesday");
            break;
            case 3:
            System.out.println("Its a Wednesday");
            break;
            case 4:
            System.out.println("Its a Thursday");
            break;
            case 5:
            System.out.println("Its a Friday");
            break;
            case 6:
            System.out.println("Its a Saturday");
            break;
            case 7:
            System.out.println("Its a Sunday");
            break;
        }
    } 
}
