import java.util.Comparator;

public class SalesPriceComparator implements Comparator<Sales> {

    @Override
    public int compare(Sales s1, Sales s2) {
        return (s1.getrPrice()-s2.getrPrice());
    }
    
}
