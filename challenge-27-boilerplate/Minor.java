import java.text.DecimalFormat;
import java.util.Scanner;
public class Minor extends Customer {
    private final double interest_RATE_minor=7.00;
    private double time_in_years_minor;           
    private double balance_minor;
    private double interest_minor;
    public double getInterest_RATE_minor() {
        return interest_RATE_minor;
    }
    public double getTime_in_years_minor() {
        return time_in_years_minor;
    }
    public void setTime_in_years_minor(double time_in_years_minor) {
         this.time_in_years_minor = time_in_years_minor;
    }
    public double getBalance_minor() {
        return balance_minor;
    }
    public void accept_minor(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your acc balance: ");
        balance_minor = s.nextDouble();
        System.out.println("Enter time: ");
        time_in_years_minor = s.nextDouble();
    }
    public void calculate_interest_minor(){
        interest_minor = (balance_minor * time_in_years_minor * interest_RATE_minor ) /100;
        System.out.format("%.2f",interest_minor);
    }
}

