import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
public class Application{
    public static void main(String[] args) {
        Route[] routes=new Route[15];
        for(int i=0;i<routes.length;i++){
            routes[i]=new Route();
            routes[i].acceptDetails();
            if(!(routes[i].isValid(routes[i].getDistanceKm())) || !(routes[i].isValidTime(routes[i].getFightTime())) || !(routes[i].isValidCurrency(routes[i].getCurrency())) || !(routes[i].isValid(routes[i].getCost()))){
                i--;
                System.out.println("invalid input");
            }
            System.out.println();
        }
        List<Route> routeList=Arrays.asList(routes);
        System.out.println("SNo.    From     To      Distance in kms     Travel Time     Typical Airfare");
        for(int i=0;i<routes.length;i++){
           System.out.println((i+1)+".\t"+routeList.get(i).displayDetails());
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the source city name:");
        String fromCity=scanner.nextLine();
        System.out.println();
        showDirectFlights(routeList, fromCity);
        System.out.println();
        System.out.println("Enter the source city name:");
        String fromSourceCity=scanner.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("Enter the destination city name where you want to go:");
        String toCity=scanner.nextLine();
        System.out.println();
        showAllConnections(routeList,fromSourceCity,toCity);
        showAllConnectionsTotal(routeList,fromSourceCity,toCity);
    }
    public static void showDirectFlights(List<Route> routeList,String fromCity){
       System.out.println("From    To    Distance in Kms    Travel Time    Typial Airforce");
       for(int i=0;i<routeList.size();i++){
           if(routeList.get(i).getSourceCity().contains(fromCity)){
               System.out.println(routeList.get(i).displayDetails());
           }
       }System.out.println();
       System.out.println("Direct connection in soretd manner on the basis of destination city");
       Collections.sort(routeList,new DestinationCityComparator());
       System.out.println("From    To    Distance in Kms    Travel Time    Typial Airforce");
       for(int i=0;i<routeList.size();i++){
           if(routeList.get(i).getSourceCity().contains(fromCity)){
               System.out.println(routeList.get(i).displayDetails());
           }
        }System.out.println();
    }
    public static void showAllConnections(List<Route> routeInfo,String fromCity,String toCity){
        int f=0;
        System.out.println("Direct Connections:");
        System.out.println("From    To    Distance in Kms    Travel Time    Typial Airforce");
        System.out.println();
        for(int i=0;i<routeInfo.size();i++){
            if(routeInfo.get(i).getSourceCity().contains(fromCity)&&routeInfo.get(i).getSourceCity().contains(toCity)){
                System.out.println(routeInfo.get(i).displayDetails());
                System.out.println();
                f=0;
                break;
            }else{
                f=1;
            }
        }
        if(f==1){
             System.out.println("There is no direct connection between "+fromCity+"to"+toCity);
             System.out.println();
        }
        f=0;
        System.out.println("Routes with in between Connection:");
        for(int i=0;i<routeInfo.size();i++){
            if(routeInfo.get(i).getSourceCity().contains(fromCity)){
                for(int j=0;j<routeInfo.size();j++){
                    if(routeInfo.get(i).getDestinationCity().equals(routeInfo.get(j).getSourceCity())){
                        System.out.println(routeInfo.get(i).displayDetails());
                        System.out.println(routeInfo.get(j).displayDetails());
                        System.out.println();
                        f=0;
                        break;
                    }else{
                        f=1;
                    }
                }
            }
        }
        if(f == 1){
           System.out.println("There is no stop between "+fromCity+"to"+toCity);
           System.out.println();
        }
    }
    
    public static void showAllConnectionsTotal(List<Route> routeInfo,String fromCity,String toCity){
        int f=0;
        System.out.println("Direct Connections:");
        System.out.println("From    To    Distance in Kms    Travel Time    Typial Airforce");
        System.out.println();
        for(int i=0;i<routeInfo.size();i++){
            if(routeInfo.get(i).getSourceCity().contains(fromCity)&&routeInfo.get(i).getSourceCity().contains(toCity)){
                System.out.println(routeInfo.get(i).displayDetails());
                System.out.println();
                f=0;
                break;
            }else{
                f=1;
            }
        }
        if(f == 1){
             System.out.println("There is no direct connection between "+fromCity+"to"+toCity);
             System.out.println();
        }
        f=0;
        System.out.println("Routes with in between Connection:");
        for(int i=0;i<routeInfo.size();i++){
            if(routeInfo.get(i).getSourceCity().contains(fromCity)){
                for(int j=0;j<routeInfo.size();j++){
                    if(routeInfo.get(i).getDestinationCity().equals(routeInfo.get(j).getSourceCity())){
                        System.out.println(routeInfo.get(i).displayDetails());
                        System.out.println(routeInfo.get(j).displayDetails());
                        System.out.println("\t Total:\t"+(routeInfo.get(i).getDistanceKm()+routeInfo.get(j).getDistanceKm())+"\t\t"+(routeInfo.get(i).getTimeMinutes()+routeInfo.get(j).getTimeMinutes())+"\t\t"+(routeInfo.get(i).getCurrencyConverter()+routeInfo.get(j).getCurrencyConverter()));
                        System.out.println();
                        f=0;
                        break;
                    }else{
                        f=1;
                    }
                }
            }
        }
        if(f == 1){
           System.out.println("There is no stop between "+fromCity+"to"+toCity);
           System.out.println();
        }
    }
    
}

