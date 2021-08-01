import java.util.Comparator;

public class SortByName implements Comparator<Word> {

	@Override
	public int compare(Word o1, Word o2) {
		int c = o1.getWord().compareToIgnoreCase(o2.getWord());
		if(c>0)
			return 1;
		else if(c<0)
			return -1;
		else
		return 0;
	}

}
