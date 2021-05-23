public class ecommerce {
    private String Date, Payment_method;
    private String Customer_id, Product_category, Clicks_in_site;
    private String Value, Time_on_site;
    public ecommerce(){}
    public ecommerce(String Date,String Customer_id,String Product_category,String Payment_method,String Value,String Time_on_site,String Clicks_in_site){
        this.Date=Date;
        this.Customer_id=Customer_id;
        this.Product_category=Product_category;
        this.Payment_method=Payment_method;
        this.Value=Value;
        this.Time_on_site=Time_on_site;
        this.Clicks_in_site=Clicks_in_site;
    }

    public String getDate() {
        return Date;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        this.Value = value;
    }

    public String getTime_on_site() {
        return Time_on_site;
    }

    public void setTime_on_site(String time_on_site) {
        this.Time_on_site = time_on_site;
    }

    public String getClicks_in_site() {
        return Clicks_in_site;
    }

    public void setClicks_in_site(String clicks_in_site) {
        this.Clicks_in_site = clicks_in_site;
    }

    public String getProduct_category() {
        return Product_category;
    }

    public void setProduct_category(String product_category) {
        this.Product_category = product_category;
    }

    public String getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.Customer_id = customer_id;
    }

    public String getPayment_method() {
        return Payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.Payment_method = payment_method;
    }

    public void setDate(String date) {
        this.Date = date;
    }
    
}
