import java.util.*;
import java.lang.*;
public class Task10 {
    public static void main(String[] args){
        int month,year,dayofweek,daysMonth=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month (1 for jan 2 for feb etc...)");
        month=sc.nextInt();
        System.out.println("Enter year:");
        year=sc.nextInt();
        System.out.println("Enter day of week(1 for mon 2 for tue etc...)");
        dayofweek=sc.nextInt();
        switch(month){
            case 1:  
                    daysMonth = 31;
                    break;

                case 2: 
                boolean isLeap;
                if(year % 4 == 0)
                {
                    if( year % 100 == 0)
                    {
                        if ( year % 400 == 0)
                            isLeap = true;
                        else
                            isLeap = false;
                    }
                    else
                        isLeap = true;
                }
                else {
                    isLeap = false;
                }
                if(isLeap == true){
                    daysMonth=29;
                    break;
                }
                else{
                  daysMonth=28;
                  break;
                }
                case 3:
                    daysMonth = 31;
                    break;

                case 4: 
                    daysMonth = 30;
                    break; 

                case 5: 
                    daysMonth = 31;
                    break;

                case 6: 
                    daysMonth = 30;
                    break; 

                case 7: 
                    daysMonth = 31;
                    break;

                case 8: 
                    daysMonth = 31;
                    break;

                case 9: 
                    daysMonth = 30;
                    break;

                case 10: 
                    daysMonth = 31;
                    break;

                case 11: 
                    daysMonth = 30;
                    break;

                case 12: 
                    daysMonth = 31;
                    break;  
                default : System.out.print("Invalid: Your month is not recognized. ");
                    System.exit(0); 
            }
            System.out.println("sun   mon   tue   wed   thu   fri   sat");
                for(int j = 1;j<=dayofweek;j++){
                    System.out.print("   ");
                }
                for (int i = 1; i <= daysMonth; i++ ) {
                if (i <=daysMonth)
                 System.out.print( + i+"    ");
                if ((i + dayofweek ) % 7 == 0 )
                     System.out.println();
             }
             System.out.println();
                
        }
            
}

