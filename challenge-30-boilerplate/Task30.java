import java.util.*;
import java.lang.*;
public class Task30{
    public static void main(String args[]){
        try{
        int choice, choice1, choice2;
        float a,b,c;
        char ch = 'y';
        double cei,flor,sqt,d,e;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Enter the operations you wish to perform");
        System.out.println("1. Mathematical Calculation\n2. Scientific Calculation\n3. Exit");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                   System.out.println("Select an Arithmetic Operation:");
                   System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Modulo\n6. Back to main menu");
                   choice1 = sc.nextInt();
                   switch(choice1){
                       case 1:
                              System.out.println("Enter two numbers a and b");
                              a=sc.nextFloat();
                              b=sc.nextFloat();
                              c=a+b;
                              System.out.println("The addition of "+a+" and "+b+" is "+c);
                              break;
                       case 2:
                              System.out.println("Enter two numbers a and b");
                              a=sc.nextFloat();
                              b=sc.nextFloat();
                              c=a-b;
                              System.out.println("The subtraction of "+a+" and "+b+" is "+c);
                              break;
                       case 3:
                              System.out.println("Enter two numbers a and b");
                              a=sc.nextFloat();
                              b=sc.nextFloat();
                              c=a*b;
                              System.out.println("The multiplication of "+a+" and "+b+" is "+c);
                              break;
                       case 4:
                              System.out.println("Enter two numbers a and b");
                              a=sc.nextFloat();
                              b=sc.nextFloat();
                              c=a/b;
                              System.out.println("The divison of "+a+" and "+b+" is "+c);
                              break;
                       case 5:
                              System.out.println("Enter two numbers a and b");
                              a=sc.nextFloat();
                              b=sc.nextFloat();
                              c=a%b;
                              System.out.println("The modulo of "+a+" and "+b+" is "+c);
                              break;                  
                    }
                    break;
            case 2:
                   System.out.println("Select a Scientific Operation");
                   System.out.println("1. Ceil\n2. Floor\n3. Square Root\n4. Power of\n5.Back To Main Menu");
                   choice2=sc.nextInt();
                   switch(choice2){
                       case 1:
                              System.out.println("Enter a value for finding ceil value");
                              cei=sc.nextDouble();
                              System.out.println("ceiling of "+cei+" is "+Math.ceil(cei));
                              break;
                              
                       case 2:
                              System.out.println("Enter a value for finding floor value");
                              flor=sc.nextDouble();
                              System.out.println("Floor value of "+flor+" is "+Math.floor(flor));
                              break;
                       case 3:
                              System.out.println("Enter the value for finding square root value");
                              sqt=sc.nextDouble();
                              System.out.println("Square root of "+sqt+" is "+Math.sqrt(sqt));
                              break;
                       case 4:
                              System.out.println("Enter two values to find power");
                              d=sc.nextDouble();
                              e=sc.nextDouble();
                              System.out.println("Power of "+d+" and "+e+" is "+Math.pow(d,e));
                              break;
                    }
                    break;
            case 3:
                 System.exit(3);
        }
        }while(ch == 'y');
        }catch(Exception e){
            System.out.println("Wrong input Try again");
        }
    }    
    
}
