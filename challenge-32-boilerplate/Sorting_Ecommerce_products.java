public class Sorting_Ecommerce_products {
    private String pid;
    private String product_name;
    private String brand;
    private String url;
    private int retail_price;
    private int discounted_price;
    private double product_rating;
    public Sorting_Ecommerce_products(String pid, String product_name, String brand, String url, int retail_price, int discounted_price, double product_rating) {
        this.pid = pid;
        this.product_name = product_name;
        this.brand = brand;
        this.url = url;
        this.retail_price = retail_price;
        this.discounted_price = discounted_price;
        this.product_rating = product_rating;
    }
    public Sorting_Ecommerce_products() {
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
    public String getURL() {
        return url;
    }
    public void setURL(String url) {
        this.url = url;
    }
    public int getRetail_price() {
        return retail_price;
    }
    public void setRetail_price(int retail_price) {
        this.retail_price = retail_price;
    }
    public int getDiscounted_price() {
        return discounted_price;
    }
    public void setDiscounted_price(int discounted_price) {
        this.discounted_price = discounted_price;
    }
    public double getProduct_rating() {
        return product_rating;
    }
    public void setProduct_rating(double product_rating) {
        this.product_rating = product_rating;
    }
}
