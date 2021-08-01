import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.nio.Buffer;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        String filePath = ".//data/flipkart_product_sample.csv";
        FileReader fReader = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fReader);
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }
            count++;
        }
        fReader.close();
        reader.close();
        System.out.println("line" + count);
        Sorting[] sort = new Sorting[count];
        FileReader fReader1 = new FileReader(filePath);
        BufferedReader reader1 = new BufferedReader(fReader1);
        count = 0;
        while ((line = reader1.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }
            String[] words = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            // String[] words = line.split(",");
            try {
                sort[count] = new Sorting(words[0], words[1], words[2], words[3], Integer.parseInt(words[4]), words[5],
                        words[6]);
            } catch (Exception e) {
                // System.out.println("skip");
            }
            count++;
        }
      
        
        System.out.println("Enter id");

        int result = search(sort);
      
            if (result == -1) {
                System.out.println("No product is available");
            } else {
                System.out.println("found="+sort[result].getPid()+" "+sort[result].getProduct_name());
            }
        }

    

    public static int search(Sorting[] sort) {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
    
        int min = 0;
        int max = sort.length - 1;
        int mid = 1;
        while (min <= max) {
            mid = (min + max) / 2;
            String d1 = sort[mid].getPid();            
            if (id.compareTo(d1) < 0) {
                max = mid - 1;
            } else if (id.compareTo(d1) > 0) {
                min = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
     } 
}