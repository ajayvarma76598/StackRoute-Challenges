class Task4
{
	public static void main(String arg[])	
	{
	    double a,c;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter  Celsius temperature");
                   a=sc.nextDouble(); 
	    System.out.println("Fahrenheit temperature is = "+fahrenheit(a));		  	  	     
	} 
	static double fahrenheit(double c)
	{	
	return  ((9*c)/5)+32;
	}
}