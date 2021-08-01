public class TextFileAnalyzer {
    private String nameFile; 
    int countfile;
    String time;  
    private int totalWords;
    private int totalChar;
    private String mostFrequentWord;
    private int mostFrequentWordLength;
    private int numberLongWords;
    public TextFileAnalyzer() {
    }
    public TextFileAnalyzer(String nameFile) {
        this.nameFile = nameFile;
    }
    public String getNameFile() {
        return nameFile;
    }
    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }
    public int getTotalWords() {
        return totalWords;
    }
    public void setTotalWords(int totalWords) {
        this.totalWords = totalWords;
    }
    public int getTotalChar() {
        return totalChar;
    }
    public void setTotalChar(int totalChar) {
        this.totalChar = totalChar;
    }
    public String getMostFrequentWord() {
        return mostFrequentWord;
    }
    public void setMostFrequentWord(String mostFrequentWord) {
        this.mostFrequentWord = mostFrequentWord;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getNumberLongWords() {
        return numberLongWords;
    }
    public void setNumberLongWords(int numberLongWords) {
        this.numberLongWords = numberLongWords;
    }
    public int getMostFrequentWordLength() {
        return mostFrequentWordLength;
    }
    public void setMostFrequentWordLength(int mostFrequentWordLength) {
        this.mostFrequentWordLength = mostFrequentWordLength;
    }
    @Override
    public String toString() {
        return "TextFileAnalyzer \n[File name= "+ nameFile+"\nMost Frequent word = \"" + mostFrequentWord + "\"  and it has "+mostFrequentWordLength+" characters"+
                ", \nNumber of really long words = " + numberLongWords + ", \nDate and Time of the file when it was last analyzed = " + time + ", \nTotal Characters =" + totalChar
                + ", \nTotal words=" + totalWords + "]";
    } 
}

