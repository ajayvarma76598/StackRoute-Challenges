import java.util.*;
public class Task3{
    public static void main(String args[]){
        float Fahrenheit=0;
        char choice;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in degrees celcius");
        float Celsius=sc.nextFloat();  
        Fahrenheit = (Celsius*9)/5+32;
        System.out.print("Tempereture(celcius)="+Celsius);
        System.out.print("\tTemperature(Fahrenheit)="+Fahrenheit);
        System.out.println("\nDo You Want To Continue(Y/N)");
    choice = sc.next().charAt(0);
          }while(choice =='Y'||choice =='y');
    }
}