import java.util.*;
import java.lang.*;
public class Task5{
    public static void main(String args[]){
        float Fah=0,Cel=0,temp;
        char choice,scale;
        do{
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the temperature");
         temp=sc.nextFloat();  
         System.out.println("Enter the source scale(celsius(c)/Fahrenheit(f)):");
         scale=sc.next().charAt(0);
         if(scale=='c'){
             System.out.print("Temperature (Celsius)="+temp);
             System.out.print("\tTemperature(Fahrenheit)="+Fahrenheit(temp,Fah));
            }
            else {
                System.out.print("Temperature(Celsius)="+Celsius(temp,Cel));
                System.out.print("\tTemperature(Fahrenheit)="+temp);
            }
         System.out.println("\nDo You Want To Continue(Y/N)");
         choice = sc.next().charAt(0);
        }while(choice =='Y'||choice =='y');
    }
     public static float Fahrenheit(float temp,float Fah)
     {
        Fah =((temp*9)/5)+32;
        return Fah;
      }
     public static float Celsius(float temp,float Cel){
        Cel=(temp-32)*5/9;
        return Cel;
     }
}