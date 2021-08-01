public class Electric extends InternalCombustionEngine {
    private String engineType= "Internal Combustion";
    private String enginePowerSource= "Electric";
    private String engineModelNumber;

    public Electric(String engineModelNumber) {
        this.engineModelNumber = engineModelNumber;
        switch(engineModelNumber){
            case "88":
                        this.engineModelNumber="88";
                        this.setDisplacement(0);
                        this.setPowerRating(88);
                        this.setRpm(15000);
                        this.setTorque(220);
                        this.setWeight(45);
                        this.setNumberOfCylinders(0);
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