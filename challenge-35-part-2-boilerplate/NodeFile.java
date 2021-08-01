import java.io.File;

public class NodeFile {
        TextFileAnalyzer fileData;
        LinkedListWord listWord;
        NodeFile next;
        File file;
        public NodeFile() {
        }
        public NodeFile(TextFileAnalyzer fileData) {
            this.fileData = fileData;
            this.next = null;
        }
    }
