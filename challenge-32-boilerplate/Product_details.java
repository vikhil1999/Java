public class Product_details
{
    private String pid,product_name,brand,product_url;
    private int retail_price,discounted_price,product_rating;
   // private float product_rating;
    //public details(){}
    public Product_details(String pid,String name,String brand,String url,int retail,int discount,int rating)
    {
        this.pid=pid;
        this.product_name=name;
        this.brand=brand;
        this.product_url=url;
        this.retail_price=retail;
        this.discounted_price=discount;
        this.product_rating=rating;
    }
    public void setpid(String pid)
    {
        this.pid=pid;   
    }
    public String getpid()
    {
        return pid;
    }
    public String getname()
    {
        return product_name;
    }    
    public String getbrand()
    {
        return brand;
    }
    public String geturl()
    {
        return product_url;
    }
    public int getretailprice()
    {
        return retail_price;
    }
    public int getdiscount()
    {
        return discounted_price;
    }
    public float getrating()
    {
        return product_rating;
    }
    public void setname(String name)     
    {    
        this.product_name=name;  
    }
    public void setbrand(String brand)
    {   
        if(brand=="")
        this.brand=null;
        else
        this.brand=brand;  
    }
    public void seturl(String url)
    {  
        this.product_url=url;  
    }
    public void setretail(int retail) 
    {
        this.retail_price =retail;        
    }
    public void setdiscount(int discount) 
    {
        this.discounted_price = discount;
    }
    public void setrating(String rating) 
    {
        if(rating.equals("No rating available"))
            this.product_rating = 0;
        else        
        {    
            this.product_rating =  Integer.parseInt(rating);
        }
    }

    @Override
    public String toString() {
        return "Product_details [brand=" + brand + ", discounted_price=" + discounted_price + ", pid=" + pid
                + ", product_name=" + product_name + ", product_rating=" + product_rating + ", product_url="
                + product_url + ", retail_price=" + retail_price + "]";
    }
    
}
    
