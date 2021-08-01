
import java.util.Scanner;
public class BankAccountDetails
{
    String[] detailscustomer;
    BankDetails[] detailsList;
    String[] splitArray;
    String[] accountNumber;
    int numberOfCustomers;
    public void acceptDetails()
    {

        System.out.println("WELCOME..! To the IC Bank Portal ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of customers you want to create a New Account ");
        numberOfCustomers=sc.nextInt();
        detailscustomer=new String[numberOfCustomers];
        System.out.println("To create account start filling information of cutomers line by line \n In order of FUll Name,Mobile NUmber,Address,place,pincode");
        for(int i=0;i<detailscustomer.length;i++){
            detailscustomer[i]=sc.next();

        }
        splitArray=new String[numberOfCustomers];
        detailsList =new BankDetails[numberOfCustomers];
        int k=0;
        while(k<numberOfCustomers)
        {
            splitArray=detailscustomer[k].split(",");
            detailsList[k]=new BankDetails(splitArray[0], Long.parseLong(splitArray[1]), splitArray[2], splitArray[3], Integer.parseInt(splitArray[4]));
            k++;
        }

        
    }
   public void accountNumberGenerator()
    {
       accountNumber = new String[numberOfCustomers];
        for(int i=0;i<numberOfCustomers;i++)
        {

           accountNumber[i]="IC001".concat(String.valueOf((detailsList[i].getMobile_Number())/1000));
        }
        

    }
    public void nameSearch(String name)
    {
        int i=0,foundAt;
        while(i<numberOfCustomers)
        {
            if(name.equalsIgnoreCase(detailsList[i].getName()))
            {
                System.out.println("Customer Found at "+(i+1)+" in list of Bank Account Data ");
                System.out.println("Details are "+"\n"+"Name-"+detailsList[i].getName()+"\n"+"Account Number-"+accountNumber[i]+"\n"+"Mobile Number-"+detailsList[i].getMobile_Number()+"\n"+"Address-"+detailsList[i].getAddress()+"\n"+"Place-"+detailsList[i].getPlace()+"\n"+"Pincode-"+detailsList[i].getPincode());
                i++;
            }else{
                System.out.println("Name did not matched or not found with "+(i+1)+" customer of Bank Account Details");
                i++;
            }   
            
            
        }
    }
    public void placeSearch(String place)
    {
        int i=0;
        while(i<numberOfCustomers)
        {
            if(place.equalsIgnoreCase(detailsList[i].getPlace()))
            {
             System.out.println("Details are "+"Name-"+detailsList[i].getName()+" Account Number-"+accountNumber[i]+" Mobile Number-"+detailsList[i].getMobile_Number()+" Address-"+detailsList[i].getAddress()+" Place-"+detailsList[i].getPlace()+" Pincode-"+detailsList[i].getPincode());
                    i++;
                
            }
            
        }
    }


            
            
         
        
        

}


