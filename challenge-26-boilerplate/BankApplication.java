import java.util.Scanner;
public class BankApplication {
    public static void main(String[] args) {
        
    
    BankAccountDetails obj=new BankAccountDetails();
    obj.acceptDetails();
    obj.accountNumberGenerator();
    System.out.println("Please enter the Name to be Searched ");
    Scanner sc =new Scanner(System.in);
    String name=sc.next();
    obj.nameSearch(name);
    System.out.println("please enter the place to be searched");
    String place =sc.next();
    obj.placeSearch(place);
    
}
    
}


    

