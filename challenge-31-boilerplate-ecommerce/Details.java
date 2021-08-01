public class Details{
    private String date;
    private int customer_id;
    private int product_category;
    private String payment_method;
    private float value_USD;
    private float time_on_site;
    private int clicks_on_site;

    public Details(String date, int customer_id, int product_category, String payment_method,float value_USD, float time_on_site, int clicks_on_site) {
        this.date = date;
        this.customer_id = customer_id;
        this.product_category = product_category;
        this.payment_method = payment_method;
        this.value_USD=value_USD;
        this.time_on_site = time_on_site;
        this.clicks_on_site = clicks_on_site;
    }

    public Details() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getProduct_category() {
        return product_category;
    }

    public void setProduct_category(int product_category) {
        this.product_category = product_category;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public float getTime_on_site() {
        return time_on_site;
    }

    public void setTime_on_site(float time_on_site) {
        this.time_on_site = time_on_site;
    }

    public int getClicks_on_site() {
        return clicks_on_site;
    }

    public void setClicks_on_site(int clicks_on_site) {
        this.clicks_on_site = clicks_on_site;
    }

    public float getValue_USD() {
        return value_USD;
    }

    public void setValue_USD(float value_USD) {
        this.value_USD = value_USD;
    }
}
   

