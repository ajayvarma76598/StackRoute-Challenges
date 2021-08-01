public abstract class Engine{
    private int powerRating;
    private int torque;
    private int rpm;
    private int Weight;

    public Engine() {
    }

    public Engine(int powerRating, int torque, int rpm, int weight) {
        this.powerRating = powerRating;
        this.torque = torque;
        this.rpm = rpm;
        Weight = weight;
    }

    public int getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }


    

}