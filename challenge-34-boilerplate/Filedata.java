class Filedata{
    String pid;
    String product_name;
    String brand;
    String product_url;
    int retail_price;
    int discounted_price;
    int product_rating;
    public Filedata(){
    }
    public Filedata(String pid, String product_name, String brand, String product_url, int retail_price, int discounted_price, int product_rating){
        this.pid=pid;
        this.product_name=product_name;
        this.brand=brand;
        this.product_url=product_url;
        this.retail_price=retail_price;
        this.discounted_price=discounted_price;
        // if(product_rating.equals("No rating available"))
        // {
        // this.product_rating=0;
        // }
        // else{
        //    this.product_rating=Integer.parseInt(product_rating);
        // }
       this.product_rating=product_rating;
    }

    @Override
    public String toString() {
        return "Filedata [brand=" + brand + ", discounted_price=" + discounted_price + ", pid=" + pid
                + ", product_name=" + product_name + ", product_rating=" + product_rating + ", product_url="
                + product_url + ", retail_price=" + retail_price + "]";
    }
    
}