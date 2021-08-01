import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        LinkedListFile linkedListFile = new LinkedListFile();
        TextFileAnalyzer file = new TextFileAnalyzer(".//data//daffodils.txt");
        linkedListFile.insertFile(file);
        TextFileAnalyzer file1 = new TextFileAnalyzer(".//data//i_have_a_dream.txt");
        linkedListFile.insertFile(file1);
        TextFileAnalyzer file2 = new TextFileAnalyzer(".//data/moti_guj.txt");
        linkedListFile.insertFile(file2);
        linkedListFile.readTextFile();
        linkedListFile.printTextFileDetails(linkedListFile.HEAD);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file of which words you want to see: ");
        String fileName = scanner.next();
        linkedListFile.printWordsFileDetails(linkedListFile.HEAD, fileName);
    }
}

