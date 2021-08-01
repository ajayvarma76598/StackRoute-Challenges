public class Word {
    public String wordtext;
    private int wordoccurance;

    public Word() {
    }

    public Word(String wordtext, int wordoccurance) {
        this.wordtext = wordtext;
        this.wordoccurance = wordoccurance;
    }

    public String getWordtext() {
        return wordtext;
    }

    public void setWordtext(String wordtext) {
        this.wordtext = wordtext;
    }

    public int getWordoccurance() {
        return wordoccurance;
    }

    public void setWordoccurance(int wordoccurance) {
        this.wordoccurance = wordoccurance;
    }

    @Override
    public String toString() {
        return "Word [word : " + wordtext + "    wordoccurance : " + wordoccurance + " ]";
    }
    
}
