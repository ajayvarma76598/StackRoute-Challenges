public class ProductData{
    private String pid;
    private String product_name;
    private String brand;
    private String product_url;
    private double retail_price;
    private double discounted_price;
    private double product_rating;
    public ProductData() {
    }
    public ProductData(String pid, String product_name, String brand, String product_url, double retail_price,
            double discounted_price, double product_rating) {
        this.pid = pid;
        this.product_name = product_name;
        this.brand = brand;
        this.product_url = product_url;
        this.retail_price = retail_price;
        this.discounted_price = discounted_price;
        this.product_rating = product_rating;
    }
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getProduct_url() {
        return product_url;
    }
    public void setProduct_url(String product_url) {
        this.product_url = product_url;
    }
    public double getRetail_price() {
        return retail_price;
    }
    public void setRetail_price(double retail_price) {
        this.retail_price = retail_price;
    }
    public double getDiscounted_price() {
        return discounted_price;
    }
    public void setDiscounted_price(double discounted_price) {
        this.discounted_price = discounted_price;
    }
    public double getProduct_rating() {
        return product_rating;
    }
    public void setProduct_rating(double product_rating) {
        this.product_rating = product_rating;
    }
    @Override
    public String toString() {
        return "ProductData [brand=" + brand + ", discounted_price=" + discounted_price + ", pid=" + pid
                + ", product_name=" + product_name + ", product_rating=" + product_rating + ", product_url="
                + product_url + ", retail_price=" + retail_price + "]";
    }
}

