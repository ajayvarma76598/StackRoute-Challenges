import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Application {
        public static BinaryTreeWord readFile(String fileName){
            File file = new File(fileName);
            BinaryTreeWord treeWord = new BinaryTreeWord();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file)); ) {
                String line = null;
                String[] words = null;
                while ((line = bufferedReader.readLine())!=null){
                    line = line.toLowerCase().replaceAll("[,':;.]", "").replace("[-]", " ");
                    words = line.split(" ");
                    for(int i=0; i<words.length; i++){
                        if(words[i].equals("")){
                            continue;
                        }
                        treeWord.insertNode(words[i]);
                    }
                }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return treeWord;
    }
    public static void main(String[] args) {
        //creates a object of BinaryTreeWord Class
        BinaryTreeWord treeWord = readFile(".//data//daffodils.txt");
        treeWord.showTree(Traversal.FORWARD);
        System.out.println();
        System.out.println("The total number of words in given file: "+treeWord.totalWords());
        System.out.println();
        //treeWord.showTree(Traversal.REVERSE);
        System.out.println();
        //treeWord.showTree(Traversal.FREQUENCY);
        System.out.println();
    }
}