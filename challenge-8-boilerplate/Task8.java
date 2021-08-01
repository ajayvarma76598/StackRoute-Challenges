import java.util.*;
import java.lang.*;
public class Task8 {
    public static void main(String[] args){
       float amtinv,shareprice;
       double newprice,tax,totalpro;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the amount invested by the company");
       amtinv=sc.nextFloat();
       System.out.println("Enter the share price of the comapany");
       shareprice=sc.nextFloat();
       double afterinc=(amtinv*74.3);
       System.out.println("Investment amount after increase in exchange rate is:"+afterinc);
       newprice=((afterinc-(amtinv*40))/400);
       System.out.println("The new price of the stock:"+(newprice+shareprice));
       tax=(afterinc/10);
       System.out.println("The tax to be paid on the total shares at 10%:"+tax);
       totalpro=(afterinc-tax);
       System.out.println("The total profit in INR:"+totalpro);
       double dollars=(totalpro/74.3);
       System.out.println("The total profit converted to Dollars:"+dollars);
    }
    
}
