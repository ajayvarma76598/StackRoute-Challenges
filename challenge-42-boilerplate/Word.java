public class Word {
	String word;
	int occurrence;
	public Word(String word, int occurrence) {
		super();
		this.word = word;
		this.occurrence = occurrence;
	}
	public Word() {
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getOccurrence() {
		return occurrence;
	}
	public void setOccurrence(int occurrence) {
		this.occurrence = occurrence;
	}
	
}
