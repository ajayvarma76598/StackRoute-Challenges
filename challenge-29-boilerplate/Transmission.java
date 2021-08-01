public abstract class Transmission{
    private int forwardgears;
    private double firstgearratio;
    private double secondgearratio;
    private double thirdgearratio;
    private double fourthgearratio;
    private double fifthgearratio;
    private double sixthgearratio;
    private double seventhgearratio;
    private double eighthgearratio;

    public Transmission() {

    }

    public Transmission(int forwardgears, double firstgearratio, double secondgearratio, double thirdgearratio,
            double fourthgearratio, double fifthgearratio, double sixthgearratio, double seventhgearratio,
            double eighthgearratio) {
        this.forwardgears = forwardgears;
        this.firstgearratio = firstgearratio;
        this.secondgearratio = secondgearratio;
        this.thirdgearratio = thirdgearratio;
        this.fourthgearratio = fourthgearratio;
        this.fifthgearratio = fifthgearratio;
        this.sixthgearratio = sixthgearratio;
        this.seventhgearratio = seventhgearratio;
        this.eighthgearratio = eighthgearratio;
    }

    public int getForwardgears() {
        return forwardgears;
    }

    public void setForwardgears(int forwardgears) {
        this.forwardgears = forwardgears;
    }

    public double getFirstgearratio() {
        return firstgearratio;
    }

    public void setFirstgearratio(double firstgearratio) {
        this.firstgearratio = firstgearratio;
    }

    public double getSecondgearratio() {
        return secondgearratio;
    }

    public void setSecondgearratio(double secondgearratio) {
        this.secondgearratio = secondgearratio;
    }

    public double getThirdgearratio() {
        return thirdgearratio;
    }

    public void setThirdgearratio(double thirdgearratio) {
        this.thirdgearratio = thirdgearratio;
    }

    public double getFourthgearratio() {
        return fourthgearratio;
    }

    public void setFourthgearratio(double fourthgearratio) {
        this.fourthgearratio = fourthgearratio;
    }

    public double getFifthgearratio() {
        return fifthgearratio;
    }

    public void setFifthgearratio(double fifthgearratio) {
        this.fifthgearratio = fifthgearratio;
    }

    public double getSixthgearratio() {
        return sixthgearratio;
    }

    public void setSixthgearratio(double sixthgearratio) {
        this.sixthgearratio = sixthgearratio;
    }

    public double getSeventhgearratio() {
        return seventhgearratio;
    }

    public void setSeventhgearratio(double seventhgearratio) {
        this.seventhgearratio = seventhgearratio;
    }

    public double getEighthgearratio() {
        return eighthgearratio;
    }

    public void setEighthgearratio(double eighthgearratio) {
        this.eighthgearratio = eighthgearratio;
    }
    
    
}
   