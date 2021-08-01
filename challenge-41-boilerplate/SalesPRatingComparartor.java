import java.util.Comparator;

public class SalesPRatingComparartor implements Comparator<Sales> {

	@Override
	public int compare(Sales s1, Sales s2) {
	    return (s2.getProdRating()-s1.getProdRating());
	}

    
    
}
