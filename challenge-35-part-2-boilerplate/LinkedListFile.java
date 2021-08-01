import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class LinkedListFile {
    
    NodeFile HEAD;
    public LinkedListFile() {
        this.HEAD = null;
    }
    public void insertFile(TextFileAnalyzer file){
        NodeFile newNodeFile = new NodeFile(file);
        if(HEAD==null){
            newNodeFile.next = null;
            HEAD = newNodeFile; 
        } else {
            NodeFile current = HEAD;
            NodeFile previous = null;
            while(current!=null){
                previous = current;
                current = current.next;
            }
            if(previous==null){
                newNodeFile.next = HEAD;
                HEAD = newNodeFile;
            } else {
                previous.next = newNodeFile;
                newNodeFile.next = current;
            }
        }
    }
    public void readTextFile(){
        if(HEAD==null){
            return;
        }
        NodeFile current = HEAD;
        while(current!=null){
            current.listWord = new LinkedListWord();
            current.file = new File(current.fileData.getNameFile());
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(current.file)); ){
            String line = null;
            String[] words = null;
            while((line=bufferedReader.readLine())!=null){
                current.fileData.setTotalChar(current.fileData.getTotalChar()+line.length());
                line = line.toLowerCase().replaceAll("[,.:;'?]", "").replace("[-]", " ");
                words = line.split(" ");
                for(int i=0; i<words.length; i++){
                    if(words[i].equals("")){
                        continue;
                    }
                    if(words[i].equals("-")){
                        continue;
                    }
                    if(words[i].length()>15){
                        current.fileData.setNumberLongWords(current.fileData.getNumberLongWords()+1);
                    }
                    current.fileData.setTotalWords(current.fileData.getTotalWords()+1);
                    current.listWord.insertNode(words[i]);
                }
                long lastModified = current.file.lastModified();
                current.fileData.time = format(lastModified);
                current.fileData.getTime();
            }
            current.fileData.setMostFrequentWord(current.listWord.maxFrequent());
            current.fileData.setMostFrequentWordLength(current.listWord.maxFrequent().length());
            } catch (FileNotFoundException e) {
            e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
            }
            current = current.next;
        }
    }
    private String format(long lastModified) {
        DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return sdf.format(new Date(lastModified));
    }
    public void printTextFileDetails(NodeFile head) {
        if(head==null){
            return;
        }
        NodeFile temp = head;
        while(temp!=null){
            System.out.println(temp.fileData);
            System.out.println();
            temp = temp.next;
        }
    }
    public void printWordsFileDetails(NodeFile head, String fileName){
        if(head==null){
            return;
        }
        if(fileName.equalsIgnoreCase(head.fileData.getNameFile())){
            head.listWord.showWordList(Direction.FORWARD);
        } else {
            printWordsFileDetails(head.next, fileName);
        }
    }
}
