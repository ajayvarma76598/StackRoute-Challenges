import java.util.Comparator;
public class DestinationCityComparator implements Comparator<Route>{
    public int compare(Route route1,Route route2){
        return (route1.getDestinationCity().compareTo(route2.getDestinationCity()));
    }  
}

