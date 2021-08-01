import java.util.*;
import java.lang.*;
public class Task4{
    public static void main(String args[]){
        float Fah=0,Celsius=0;
        char choice;
        do{
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the temperature in degrees celsius");
         Celsius=sc.nextFloat();  
         System.out.print("Tempereture(celsius)="+Celsius);
         System.out.print("\tTemperature(Fahrenheit)="+Fahrenheit(Celsius,Fah));
         System.out.println("\nDo You Want To Continue(Y/N)");
         choice = sc.next().charAt(0);
        }while(choice =='Y'||choice =='y');
    }
     public static float Fahrenheit(float Celsius,float Fah)
     {
        Fah =((Celsius*9)/5)+32;
        return Fah;
      }
}