import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        String engineModelNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of engine");
        System.out.println("1.Petrol\n2.Diesel\n3.CNG\n4.Electric\n");
        n = sc.nextInt();
            System.out.println("Enter engine model number ");
            engineModelNumber =sc.next();
        switch(n){
            case 1:
		        PetrolEngine p = new PetrolEngine(engineModelNumber);
                break;
            case 2:
                DieselEngine d = new DieselEngine(engineModelNumber);
                break;
            case 3:
                CNG c = new CNG(engineModelNumber);
                break;
            case 4:
                Electric e = new Electric(engineModelNumber);
                break;
            default:
                System.out.println("enter a valid option");
                break;
        }

    }
    
}
