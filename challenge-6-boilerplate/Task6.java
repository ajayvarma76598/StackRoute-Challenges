import java.util.*;
import java.lang.*;
public class Task6{
    public static void main(String[] args){
        String s1;
        float amount;
        double value;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Source Currency");
        s1=in.nextLine();
        System.out.println("Enter The Amount");
        amount=in.nextFloat();
        if(s1.equals("usd")||s1.equals("USD")){
            value = amount*74.3;
            System.out.print("The exchange rate for "+amount +s1 +"is :"+value +"INR");
        }
        else if(s1.equals("gbp")||s1.equals("GBP")){
            value = amount*94.5;
            System.out.print("The exchange rate for "+amount +s1 +"is :"+value +"INR");
        }
        else if(s1.equals("jpy")||s1.equals("JPY")){
            value = amount*0.67;
            System.out.print("The exchange rate for "+amount +s1 +"is :"+value +"INR");
        }
        else if(s1.equals("eur")||s1.equals("EUR")){
            value = amount*85.37;
            System.out.print("The exchange rate for "+amount +s1 +"is :"+value +"INR");
        }
        else{
            value = amount*20.25;
            System.out.print("The exchange rate for "+amount +s1 +"is :"+value +"INR");
        }
        
    }
}
