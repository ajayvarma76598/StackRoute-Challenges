import java.util.Scanner;

public class Task5 {
    public static void main(String args[]){
        float celcius,fahrenheit,temperature;
        Char choice,choice1,type;
        do{
         Scanner sc=new scanner(System.in);
         System.out.print("Enter The Temperature\n");
          temperature =sc.nextFloat();
          System.out.print("Enter the source scale(celcius(c)/fahrenheit(f))\n");
          type =sc.next().charAt(0);
            if(type == 'c')
          {
          System.out.print("Temperature(celcius)"+celcius);
          System.out.print("Temperature(fahrenheit)"+fahrenheit(temperature));
          }
          else         
          {
          System.out.print("Temperature(celcius)"+celcius(temperature));
          System.out.print("Temperature(fahrenheit)"+fahrenheit);
          }
          System.out.print("Do you want to continue(y/n)");
           choice1 = sc.next().charAt(0);
        }while(choice == 'y'|| choice == 'Y');
    }
    static float fahrenheit(float temperature)
    {
        return ((celcius*(9f/5)+32));
    }
    static float celcius(float temperature)
    {
        return (((fahrenheit-32)*5)/9);
    }
}
