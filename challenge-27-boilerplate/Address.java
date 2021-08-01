import java.lang.Thread.State;
import java.util.Scanner;
public class Address {
    private String street;
    private String village;
    private String state;
    private String zip_code;
    public String getVillage() {
        return village;
    }
    public void setVillage(String village) {
        this.village = village;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip_code() {
        return zip_code;
    }
    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
    public void accept_address(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your address (Street name, village name, State, Zip-Code)");
        String add = s.nextLine();
        String[] add_array = add.split(", ");
        street = add_array[0];
        village = add_array[1];
        state = add_array[2];
        zip_code = add_array[3];
    }
    public void display_address(){
        System.err.println(street+", "+village+", "+state+", "+zip_code);
    }
}
