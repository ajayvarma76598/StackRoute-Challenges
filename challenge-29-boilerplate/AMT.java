public class AMT extends Transmission{
    private String transmissiontype="AMT";
    private String transmissionmodel;
    public AMT(String transmissionmodel){
        this.transmissionmodel = transmissionmodel;
        switch(transmissionmodel){
            case "AMTP4":
                    this.transmissionmodel="AMTP4";
                    this.setForwardgears(4);
                    this.setFirstgearratio(2.450);
                    this.setSecondgearratio(1.920);
                    this.setThirdgearratio(1.510);
                    this.setFourthgearratio(1.000);
                    showspecs();
                    break;
            case "AMTD5":
                    this.transmissionmodel="AMTD5";
                    this.setForwardgears(5);
                    this.setFirstgearratio(2.950);
                    this.setSecondgearratio(1.940);
                    this.setThirdgearratio(1.340);
                    this.setFourthgearratio(1.000);
                    this.setFifthgearratio(0.630);
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
