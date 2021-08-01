import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main {
    private static linkedlist readAndParseFile(String filepath){
        File file = new File(filepath);
        linkedlist list = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = null;
            String[] words = null;
            list = new linkedlist();
            while((line = reader.readLine())!=null){
                line = line.toLowerCase().replaceAll("[,':;.]", "").replaceAll("[-]", " ");
                words = line.split(" ");
                for(String word:words){
                    list.addnode(word);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return list;
    }
public static void main(String[] args) {
    linkedlist list = readAndParseFile("/home/ajay/Desktop/challenges/challenge-35-boilerplate/data/daffodils.txt");
    //list.printwords(TraversalDirection.FORWARD);
    //list.printwords(TraversalDirection.REVERSE);
    list.printwords(TraversalDirection.FREQUENCY);
}
}