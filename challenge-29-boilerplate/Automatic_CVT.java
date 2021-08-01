public class Automatic_CVT extends Transmission{
    private String transmissiontype="Automatic_CVT";
    private String transmissionmodel;
    public Automatic_CVT(String transmissionmodel){
        this.transmissionmodel = transmissionmodel;
        switch(transmissionmodel){
            case "CVT6":
                    this.transmissionmodel="CVT6";
                    this.setForwardgears(6);
                    this.setFirstgearratio(2.631);
                    this.setSecondgearratio(1.440);
                    this.setThirdgearratio(1.165);
                    this.setFourthgearratio(0.906);
                    this.setFifthgearratio(0.680);
                    this.setSixthgearratio(0.499);
                    showspecs();
                    break;
            default:
            System.out.println("invalid model number");
        }
    }
        public void showspecs(){
            System.out.println("Transmission Type :"+transmissiontype);
            System.out.println("Transmission Model :"+transmissionmodel);
            System.out.println("**Key Specification**");
            System.out.println("1. Forward Gears   :"+getForwardgears());
            System.out.println("2. 1st GearRatio   :"+getFirstgearratio());
            System.out.println("3. 2nd GearRatio   :"+getSecondgearratio());
            System.out.println("4. 3rd GearRatio   :"+getThirdgearratio());
            System.out.println("5. 4th GearRatio   :"+getFourthgearratio());
            System.out.println("6. 5th GearRatio   :"+getFirstgearratio());
            System.out.println("7. 6th GearRatio   :"+getSixthgearratio());
            System.out.println("8. 7th GearRatio   :"+getSeventhgearratio());
            System.out.println("9. 8th GearRatio   :"+getEighthgearratio());
        } 

    
}
