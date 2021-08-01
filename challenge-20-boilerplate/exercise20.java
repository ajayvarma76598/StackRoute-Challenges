import java.util.Scanner;

class exercise20{

    public static int fibonacci(int n) {
      if(n<1)
        {
            return 0;
        }
      int sum = 0;
    
      int a = 0;
      int b = 1;


        for (int i=0;i<n;i++) 
        {
           sum = a + b;
           a=b;
           b=sum;
           System.out.println(a+"  +"+"   "+b+"  =" +sum);
        
        }

     return 0;
    }
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the limit of fibonacci series");
        n= sc.nextInt();
        fibonacci(n);
    }
}