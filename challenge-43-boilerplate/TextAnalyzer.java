import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextAnalyzer {

	public static void main(String[] args) {
		String line = "";
		BufferedReader br;
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		List<Word> list = new ArrayList<Word>();
		File file = new File("./data/daffodils.txt");
		if (!file.exists()) {
			throw new RuntimeException(" does not exist");
		}
		try {
			br = new BufferedReader(new FileReader(file));

			while ((line = br.readLine()) != null)
			{
				line = line.replace(",", "").replace(":", "").replace(".", "").replace(";", "");
				String[] words = line.split(" ");
				for (int i = 0; i < words.length; i++) {
					int count;
					if (words[i].trim().isEmpty())
						continue;
					if (hashMap.containsKey(words[i])) {
						count = hashMap.get(words[i]);
						hashMap.put(words[i], count + 1);
					} else {
						hashMap.put(words[i], 1);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
		for (Map.Entry<String, Integer> val : hashMap.entrySet()) {
			Word w = new Word(val.getKey(), val.getValue());
			list.add(w);
		}
		long a,b,c;
		a = System.currentTimeMillis();
		System.out.println("\nWord list without ordering\n");
		showWordList(list);
		b = System.currentTimeMillis();
		c=b-a;
		System.out.println("Time taken - " + c);
		
		a = System.currentTimeMillis();
		Collections.sort(list, new SortByName());
		System.out.println("\norder list\n");
		showWordList(list);
		b = System.currentTimeMillis();
		c=b-a;
		System.out.println("Time taken - " + c);
		
		a = System.currentTimeMillis();
		System.out.println("\nreverse order\n");
		Collections.sort(list, new ReverseOrder());
		showWordList(list);
		b = System.currentTimeMillis();
		c=b-a;
		System.out.println("Time taken - " + c);
		
		a = System.currentTimeMillis();
		System.out.println("\nin order - frequency and then name");
		Collections.sort(list, new SortWords());
		showWordList(list);
		b = System.currentTimeMillis();
		c=b-a;
		System.out.println("Time taken - " + c);
	}

	private static void showWordList(List<Word> list) {
		for (Word w : list) {
			System.out.println("word " + w.getWord() + ": " + w.getOccurrence());
		}

	}

}
