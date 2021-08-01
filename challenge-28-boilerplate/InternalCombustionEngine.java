public abstract class InternalCombustionEngine extends Engine{
    private int numberOfCylinders;
    private int displacement;
    private String compressionRatio;

    public InternalCombustionEngine(){
        
    }

    public InternalCombustionEngine(int numberOfCylinders, int displacement, String compressionRatio) {
        this.numberOfCylinders = numberOfCylinders;
        this.displacement = displacement;
        this.compressionRatio = compressionRatio;
    }

    public InternalCombustionEngine(int powerRating, int torque, int rpm, int weight, int numberOfCylinders,
            int displacement, String compressionRatio) {
        super(powerRating, torque, rpm, weight);
        this.numberOfCylinders = numberOfCylinders;
        this.displacement = displacement;
        this.compressionRatio = compressionRatio;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(String compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    
}