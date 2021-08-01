public class Word {
    private String word_element;
    private int frequency;
    public Word() {
    }
    public Word(String word_element) {
        this.word_element = word_element;
        this.frequency = 1;
    }
    public Word(String word_element, int frequency) {
        this.word_element = word_element;
        this.frequency = frequency;
    }
    public String getWord_element() {
        return word_element;
    }
    public void setWord_element(String word_element) {
        this.word_element = word_element;
    }
    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    @Override
    public String toString() {
        return "Word [Word : "+word_element+"   Word Occurence : "+frequency+" ]";
    }
}
