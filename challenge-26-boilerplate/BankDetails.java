
public class BankDetails {

    private String Name;
    private long mobile_Number;
    private String address;
    private String place;
    private int pincode;
    
    public BankDetails(String name, long mobile_Number, String address, String place, int pincode) {
        Name = name;
        this.mobile_Number = mobile_Number;
        this.address = address;
        this.place = place;
        this.pincode = pincode;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setName(String name) {
        Name = name;
    }
    
    public long getMobile_Number() {
        return mobile_Number;
    }
    
    public void setMobile_Number(long mobile_Number) {
        this.mobile_Number = mobile_Number;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPlace() {
        return place;
    }
    
    public void setPlace(String place) {
        this.place = place;
    }
    
    public int getPincode() {
        return pincode;
    }
    
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    
    public BankDetails() {
    }
    
    
    
    
}
    
    

