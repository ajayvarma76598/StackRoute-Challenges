import java.util.Scanner;
public class Application_savings_bank_account {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //the number of customer whose savings account is to be created
        System.out.println("Enter the number of customer whose savings account is to be created: ");
        int num = s.nextInt();
        int[] customers_id = new int[num];
        long[] customer_acc = new long[num]; 
        Customer[] bank_customer = new Customer[num];
        for(int i=0; i<num; i++){
            System.out.println();
            bank_customer[i] = new Customer();
                bank_customer[i].accept_details();
                System.out.println();
               int j=i+1-1;
                if(i!=0){
                    i--;
                    while(j<num){
                        if((bank_customer[j].equals(bank_customer[i]))){
                            System.out.println("you are already a customer of our bank.");
                            i++;
                            break;
                        }
                        if(!(bank_customer[j].equals(bank_customer[i]))){
                            System.out.println("Congratulations! Your Savings Bank Account is now Activated. Your Customer ID and Account no. are generated.");
                            customers_id[j] = bank_customer[j].getCustomer_ID();
                            System.out.println();
                            System.out.println("The customer ID of the customer: "+customers_id[j]); 
                            customer_acc[j] = bank_customer[j].getAccount_no(); 
                            System.out.println("The Account Number of the customer: "+customer_acc[j]); 
                            System.out.println(); 
                            i++;
                            break;
                        }
                    }
                }
                if(i==0){
                    System.out.println("Congratulations! Your Savings Bank Account is now Activated. Your Customer ID and Account no. are generated.");
                    customers_id[i] = bank_customer[i].getCustomer_ID();
                    System.out.println();
                    System.out.println("The customer ID of the customer: "+customers_id[i]); 
                    customer_acc[i] = bank_customer[i].getAccount_no(); 
                    System.out.println("The Account Number of the customer: "+customer_acc[i]); 
                    System.out.println(); 
                }
            }  
        System.out.println();
        System.out.println("Do you want to calculate Interest of your amount? (type 'y' for yes and 'n' for no)");
        char ch = s.next().charAt(0);
        while(ch=='y'){
            System.out.println("Enter your age to calculate the interest: ");
            int age = s.nextInt();
            if(age>50){
                Senior senior = new Senior();
                senior.accept_senior();
                System.out.print("You will earn interest after given time: ");
                senior.calculate_interest_senior();      
                System.out.println();
            
            }else if(age<=50 && age>18){
                Public_person publicc = new Public_person();
                publicc.accept_public();
                System.out.print("You will earn interest after given time: ");
                publicc.calculate_interest_public();      
                System.out.println();
            }else{
                Minor minor = new Minor();
                minor.accept_minor();
                System.out.print("You will earn interest after given time: ");
                minor.calculate_interest_minor();     
                System.out.println();
            }
            ch='n';
        } 
        System.out.println();
        Savings_bank_account customer_1_account = new Savings_bank_account();
        char perform;
        do{
            System.out.println();
            System.out.println("If you want to see your account balance and perform task, please fill below details: ");
            customer_1_account.accept_account_details();
            
            System.out.println();
            System.out.println("Do you want to deposit money in your account \"type 'y' for yes and 'n' for no\"");
            char deposit = s.next().charAt(0);
            while(deposit=='y'){
                customer_1_account.deposit_money();
                deposit='n';
            }
            System.out.println();
            System.out.println("Do you want to withdraw money from your account \"type 'y' for yes and 'n' for no\"");
            char withdraw = s.next().charAt(0);
            while(withdraw=='y'){
                customer_1_account.withdraw_money();
                withdraw='n';
            }
            System.out.println("");
            System.out.println("Do you want to transfere money from your account to other's account \"type 'y' for yes and 'n' for no\"");
            char transfer = s.next().charAt(0);
            while(transfer=='y'){
                System.out.println();
                Savings_bank_account customer_2_account = new Savings_bank_account();
                customer_1_account.fund_transfere(customer_2_account);
                transfer='n';
            }
            System.out.println("Do you want to perform tasks continue\"type 'y' for yes and 'n' for no\"");
            perform = s.next().charAt(0);
        }while( perform=='y');
    }
}
