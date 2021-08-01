public class Manual extends Transmission{
    private String transmissiontype="Manual";
    private String transmissionmodel;
    public Manual(String transmissionmodel){
        this.transmissionmodel = transmissionmodel;
        switch(transmissionmodel){
            case "MP4":
                    this.transmissionmodel="MP4";
                    this.setForwardgears(4);
                    this.setFirstgearratio(2.450);
                    this.setSecondgearratio(1.920);
                    this.setThirdgearratio(1.510);
                    this.setFourthgearratio(1.000);
                    showspecs();
                    break;
            case "MP5":
                    this.transmissionmodel="MP5";
                    this.setForwardgears(5);
                    this.setFirstgearratio(3.545);
                    this.setSecondgearratio(1.904);
                    this.setThirdgearratio(1.280);
                    this.setFourthgearratio(0.914);
                    this.setFifthgearratio(0.757);
                    showspecs();
                    break;
            case "MP6":
                    this.transmissionmodel="MP6";
                    this.setForwardgears(6);
                    this.setFirstgearratio(3.010);
                    this.setSecondgearratio(2.070);
                    this.setThirdgearratio(1.430);
                    this.setFourthgearratio(1.000);
                    this.setFifthgearratio(0.710);
                    this.setSixthgearratio(0.570);
                    showspecs();
                    break;
            case "MD5":
                    this.transmissionmodel="MD5";
                    this.setForwardgears(5);
                    this.setFirstgearratio(3.545);
                    this.setSecondgearratio(1.904);
                    this.setThirdgearratio(0.911);
                    this.setFifthgearratio(0.725);
                    showspecs();
                    break;
            case "MD6":
                    this.transmissionmodel="MD6";
                    this.setForwardgears(6);
                    this.setFirstgearratio(3.640);
                    this.setSecondgearratio(2.150);
                    this.setThirdgearratio(1.360);
                    this.setFourthgearratio(1.000);
                    this.setFifthgearratio(0.750);
                    this.setSixthgearratio(0.630);
                    showspecs();break;
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
