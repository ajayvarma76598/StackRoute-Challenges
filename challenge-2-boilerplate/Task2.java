public class Task2
{
    public static void main(String[] args)
    {
    int slNo=0 ,i=1;
    float celsius=0;
    double faren=0;
    System.out.println("slno   " +"Temperature(Celsius)   "+"Temperature(Fahrenheit)");
    for (int j = 0; j <= 10; j++) 
    {
        int cel = j*10;
        celsius = cel;
        faren= ((cel*(9f/5)+32));
        System.out.println(slNo +"            "+ celsius+"                "+ faren);
        slNo++;
    }
    }
}