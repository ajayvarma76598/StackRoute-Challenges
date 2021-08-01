public class PetrolEngine extends InternalCombustionEngine {
    private String engineType= "Internal Combustion";
    private String enginePowerSource= "Petrol";
    private String engineModelNumber;

    public PetrolEngine(String engineModelNumber) {
        this.engineModelNumber = engineModelNumber;
        switch(engineModelNumber){
            case "P1000":
                        this.engineModelNumber="P1000";
                        this.setDisplacement(996);
                        this.setPowerRating(50);
                        this.setRpm(6000);
                        this.setTorque(90);
                        this.setWeight(75);
                        this.setNumberOfCylinders(3);
                        showSpec();break;
            case "P1500":
                        this.engineModelNumber="P1500";
                        this.setDisplacement(1498);
                        this.setPowerRating(88);
                        this.setRpm(6500);
                        this.setTorque(155);
                        this.setWeight(93);
                        this.setNumberOfCylinders(4);
                        showSpec();break;
            case "P2000":
                        this.engineModelNumber="P2000";
                        this.setDisplacement(1992);
                        this.setPowerRating(188);
                        this.setRpm(6500);
                        this.setTorque(220);
                        this.setWeight(125);
                        this.setNumberOfCylinders(4);
                        showSpec();break;
            case "P2400":
                        this.engineModelNumber="P2400";
                        this.setDisplacement(2396);
                        this.setPowerRating(138);
                        this.setRpm(6900);
                        this.setTorque(340);
                        this.setWeight(140);
                        this.setNumberOfCylinders(6);
                        showSpec();break;
            default :
                        System.out.println("Invalid model number");

        }
    }

    public void showSpec() {
        System.out.println("Engine Type         :"+engineType);
        System.out.println("Engine Power Source :"+enginePowerSource);
        System.out.println("Engine Model Number :"+engineModelNumber);
        System.out.println("*Key Specifications:*");
        System.out.println("1.	Displacement:"+getDisplacement());
        System.out.println("2.	Max Power:"+getPowerRating());
        System.out.println("3.	Max RPM:"+getRpm());
        System.out.println("4.	Max Torque:"+getTorque());
        System.out.println("5.	Weight:	"+getWeight());
        System.out.println("6.	Number of Cylinders:"+getNumberOfCylinders());
        System.out.println("8.	Compression Ratio:"+getCompressionRatio());
    }



    
}
