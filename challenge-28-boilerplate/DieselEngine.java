public class DieselEngine extends InternalCombustionEngine {
    private String engineType= "Internal Combustion";
    private String enginePowerSource= "Diesel";
    private String engineModelNumber;

    public DieselEngine(String engineModelNumber) {
        this.engineModelNumber = engineModelNumber;
        switch(engineModelNumber){
            case "D1300":
                        this.engineModelNumber="D1300";
                        this.setDisplacement(1248);
                        this.setPowerRating(67);
                        this.setRpm(6000);
                        this.setTorque(200);
                        this.setWeight(111);
                        this.setNumberOfCylinders(4);
                        showSpec();break;
            case "D1800":
                        this.engineModelNumber="D1800";
                        this.setDisplacement(1796);
                        this.setPowerRating(203);
                        this.setRpm(6300);
                        this.setTorque(170);
                        this.setWeight(141);
                        this.setNumberOfCylinders(4);
                        showSpec();break;
            case "D2400":
                        this.engineModelNumber="D2400";
                        this.setDisplacement(2384);
                        this.setPowerRating(136);
                        this.setRpm(7000);
                        this.setTorque(233);
                        this.setWeight(152);
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

