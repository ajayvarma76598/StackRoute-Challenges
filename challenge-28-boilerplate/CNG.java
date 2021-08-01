public class CNG extends InternalCombustionEngine {
    private String engineType= "Internal Combustion";
    private String enginePowerSource= "CNG";
    private String engineModelNumber;

    public CNG(String engineModelNumber) {
        this.engineModelNumber = engineModelNumber;
        switch(engineModelNumber){
            case "C1000":
                        this.engineModelNumber="C1000";
                        this.setDisplacement(998);
                        this.setPowerRating(43);
                        this.setRpm(6000);
                        this.setTorque(78);
                        this.setWeight(75);
                        this.setNumberOfCylinders(3);
                        showSpec();break;
            case "C1500":
                        this.engineModelNumber="D1500";
                        this.setDisplacement(1498);
                        this.setPowerRating(69);
                        this.setRpm(6500);
                        this.setTorque(122);
                        this.setWeight(93);
                        this.setNumberOfCylinders(4);
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


