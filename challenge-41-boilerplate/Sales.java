public class Sales {
    private String pid,prodName,brand,prodURL;
    private int rPrice,dPrice,prodRating;

    public Sales(String pid, String prodName, String brand, String prodURL, int rPrice, int dPrice, int prodRating) {
        this.pid = pid;
        this.prodName = prodName;
        this.brand = brand;
        this.prodURL = prodURL;
        this.rPrice =rPrice;
        this.dPrice = dPrice;
        this.prodRating = prodRating;
    }


    @Override
    public String toString() {
        return "Sales [brand=" + brand + ", dPrice=" + dPrice + ", pid=" + pid + ", prodName=" + prodName
                + ", prodRating=" + prodRating + ", prodURL=" + prodURL + ", rPrice=" + rPrice + "]";
    }

    public Sales() {
    }
    
    public String getPid() {
        return pid;
    }
    
    public void setPid(String pid) {
        this.pid = pid;
    }
    
    public String getProdName() {
        return prodName;
    }
    
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getProdURL() {
        return prodURL;
    }
    
    public void setProdURL(String prodURL) {
        this.prodURL = prodURL;
    }
    
    public int getrPrice() {
        return rPrice;
    }
    
    public int getdPrice() {
        return dPrice;
    }
    
    public int getProdRating() {
        return prodRating;
    }
    
    public void setrPrice(String rPrice) {
        try{
        this.rPrice = Integer.parseInt(rPrice);
        }catch(NumberFormatException e){}
    }
    
    public void setdPrice(String dPrice) {
        try{
        this.dPrice = Integer.parseInt(dPrice);
        }catch(NumberFormatException e){}
    }
    
    public void setProdRating(String prodRating) {
        try{
        this.prodRating = Integer.parseInt(prodRating);
        }catch(NumberFormatException e){}
    }
    

    
}    