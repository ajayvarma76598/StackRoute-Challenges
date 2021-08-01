public class Automatic_DCT extends Transmission{
    private String transmissiontype="Automatic_DCT";
    private String transmissionmodel;
    public Automatic_DCT(String transmissionmodel){
        this.transmissionmodel = transmissionmodel;
        switch(transmissionmodel){
            case "DCT8":
                    this.transmissionmodel="DCT8";
                    this.setForwardgears(8);
                    this.setFirstgearratio(4.714);
                    this.setSecondgearratio(3.143);
                    this.setThirdgearratio(2.106);
                    this.setFourthgearratio(1.667);
                    this.setFifthgearratio(1.285);
                    this.setSixthgearratio(1.000);
                    this.setSeventhgearratio(0.839);
                    this.setEighthgearratio(0.667);
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
