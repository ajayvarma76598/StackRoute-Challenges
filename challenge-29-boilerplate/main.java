import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        String transmissionmodel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Transmission Type");
        System.out.println("1.Manual\n2.AMT\n3.Automatic_CVT\n4.Automatic_DCT");
        n = sc.nextInt();
        System.out.println("Enter Transmission Model");
        transmissionmodel = sc.next();
        switch(n){
            case 1:
                Manual m = new Manual(transmissionmodel); 
                break;
            case 2:
                AMT a = new AMT(transmissionmodel);
                break;
            case 3:
                Automatic_CVT b = new Automatic_CVT(transmissionmodel);
                break;
            case 4:
                Automatic_DCT c = new Automatic_DCT(transmissionmodel);
                break;
            default:
                System.out.println("Enter a valid option");
                break;         
        }

    }
    
}
