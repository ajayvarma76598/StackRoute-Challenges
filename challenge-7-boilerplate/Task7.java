import java.util.*;
import java.lang.*;
 public class Task7{ 
     public static void main(String[] args){
          Double USD = 74.3, JPY = 0.67,GBP = 94.5, EUR = 85.37; 
          float INR_1=1, INR_2=10, INR_3=20, INR_4=50, INR_5=100;
           System.out.println("|Domination(INR)|   USD    |  JPY   |   GBP   |   EUR   |"); 
           System.out.println("|------------|------|----|---- -|--- --|"); 
           System.out.println("| "+INR_1+"  |"+INR_1*USD+" |"+INR_1*JPY+"|"+INR_1*GBP+" |"+INR_1*EUR+" |"); 
           System.out.println("| "+INR_2+"  |"+INR_2*USD+" |"+INR_2*JPY+" |"+INR_2*GBP+" |"+INR_2*EUR+" |"); 
           System.out.println("| "+INR_3+"  |"+INR_3*USD+"|"+INR_3*JPY+"|"+INR_3*GBP+"|"+INR_3*EUR+"|"); 
           System.out.println("| "+INR_4+"  |"+INR_4*USD+"|"+INR_4*JPY+"|"+INR_4*GBP+"|"+INR_4*EUR+"|"); 
           System.out.println("| "+INR_5+"  |"+INR_5*USD+"|"+INR_5*JPY+"|"+INR_5*GBP+"|"+INR_5*EUR+"|"); 
           Scanner input = new Scanner(System.in); 
           System.out.println("Enter origin currency"); 
           String origin= input.next(); 
           System.out.println("Enter end currency"); 
           String end= input.next(); 
           System.out.println("Enter amount"); 
           double amount_1= input.nextDouble(); 
           double amount_2=0; 
           switch (origin){
                case "USD": System.out.println("origin currency "+amount_1+" "+origin); 
                            amount_2=amount_1*USD;
                            break;
                case "JPY": System.out.println("origin currency "+amount_1+" "+origin); 
                            amount_2=amount_1*JPY;
                            break; 
                case "GBP": System.out.println("origin currency "+amount_1+" "+origin); 
                            amount_2=amount_1*GBP;
                            break;
                case "EUR": System.out.println("origin currency "+amount_1+" "+origin); 
                            amount_2=amount_1*EUR;
                            break;
                        
                        }
             switch (end){
                  case "USD": System.out.println("end currency is "+(amount_2/USD)+" "+end);
                               break;
                  case "JPY": System.out.println("end currency is "+(amount_2/JPY)+" "+end);
                               break; 
                  case "GBP": System.out.println("end currency is "+(amount_2/GBP)+" "+end);
                               break; 
                  case "EUR": System.out.println("end currency is "+(amount_2/EUR)+" "+end);
                              break; 
                            }
    }
}