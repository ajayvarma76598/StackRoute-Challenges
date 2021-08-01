import java.util.Scanner;
public class RoutePlanner {
    public static String[] showDirectFlights(String[] routes, String fromCity){
        int length=0;
        int flag =0;
        int k=0;
        for(int i=0;i<15;i++){

            if(routes[i].contains(fromCity)) {
                length++;
            }
            System.out.println();
        }
        String[] directFlights = new String[length];
        for(int i=0;i<15;i++){

            if(routes[i].contains(fromCity)) {
                flag=1;
                directFlights[k]=routes[i];
                k++;
            }
            System.out.println();
        }
        if(flag==0){
            System.out.println("We are sorry. At this point in time we do not have any information on flights in the specified route");
        }
        return directFlights;

    }
    public static void printTable(String[] routes){
        for(int i=0;i<(routes.length);i++){
            System.out.print(i+1);
            String[] contents = SplitForTable(routes[i]);
            String initCaps  = contents[0].substring(0, 1).toUpperCase() + contents[0].substring(1);
            System.out.print("\t\t\t"+initCaps+" ");
            String initCaps1  = contents[1].substring(0, 1).toUpperCase() + contents[1].substring(1);
            System.out.print("\t\t\t"+initCaps1+" ");
            System.out.print("\t\t\t"+contents[2]+" ");
            System.out.print("\t\t\t"+contents[3]+" ");
            System.out.println("\t\t\t"+contents[4]+" ");
            System.out.println();
        }
    }
    public static String[] SplitForTable(String routes) {
        String[] contents = routes.split(",");
        return contents;
    }
    public static String[] tosort(String[] toSort){
        String[] conten ;
        String[] conten1 ;
        for(int i=0;i<toSort.length;i++){
            for(int j=i+1;j<toSort.length;j++) {
                conten=SplitForTable(toSort[i]);
                conten1 = SplitForTable(toSort[j]);
                if(conten[1].compareTo(conten1[1])>0){
                   String temp = toSort[j];
                   toSort[j] = toSort[i];
                   toSort[i] = temp;
                }
            }
        }
        return toSort;

    }
    public static String[] showAllConnections(String[] routes, String fromCity, String toCity){
        int length=0;
        String[] conten;
        String[] conten1;
        for(int i=0;i<routes.length;i++){
            conten=SplitForTable(routes[i]);
            if(conten[0].contains(fromCity) && conten[1].contains(toCity)) {
                length++;
                continue;
            }
            for(int j=0;j<routes.length;j++) {
                conten1= SplitForTable(routes[j]);
                if(conten[0].contains(fromCity) && conten[1].contains(conten1[0]) && conten1[1].contains(toCity)){
                    length=length+2;
                }
            }
        }
        String[] routes1 = new String[length];
        int k=0;
        int l=0;
        for(int i=0;i<routes.length;i++){
            for(int j=0;j<routes.length;j++) {
                conten=SplitForTable(routes[i]);
                conten1= SplitForTable(routes[j]);
                if(conten[0].contains(fromCity) && conten[1].contains(toCity)){
                    routes1[k]=routes[i];
                    k=k+1;
                    break;
                }
                if(conten[0].contains(fromCity) && conten[1].contains(conten1[0]) && conten1[1].contains(toCity)){
                    routes1[k+l]=routes[i];
                    routes1[k+l+1]=routes[j];
                    l=l+2;

                }
            }
        }
        return routes1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] routes = new String[15];
        //Taking the input from user of the Routes and Details
        System.out.println("Enter 15 Routes to Store in the following order");
        System.out.println("From, To, Distance in Kms, Travel Time, Typical Airfare");
        for (int i=0;i< routes.length;i++){
            routes[i]=sc.nextLine();
        }

        System.out.println("SNo.\t\tFrom\t\t\t\t  To\t\tDistance in Kms\t\tTravel Time\t\tTypical Airfare(INR)");
        printTable(routes);//Table of Routes

        System.out.println("Direct flights from your Desired City\n");
        System.out.println("SNo.\t\tFrom\t\t\t\t  To\t\tDistance in Kms\t\tTravel Time\t\tTypical Airfare(INR)");
        printTable(showDirectFlights(routes,"Delhi"));//To show Direct Flights to the Destination City
        System.out.println("Sorted Direct flights from your Desired City");
        System.out.println("SNo.\t\tFrom\t\t\t\t  To\t\tDistance in Kms\t\tTravel Time\t\tTypical Airfare(INR)");
        String[] toSortString= showDirectFlights(routes,"Delhi");//
        String[] sorted = tosort(toSortString);//Storing the Sorted String output
        printTable(sorted);//Printing the Sorted String
        System.out.println("Direct flights And Indirect from your Desired City");
        System.out.println("SNo.\t\tFrom\t\t\t\t  To\t\tDistance in Kms\t\tTravel Time\t\tTypical Airfare(INR)");
        printTable(showAllConnections(routes, "Delhi", "London"));
    
    }
}












