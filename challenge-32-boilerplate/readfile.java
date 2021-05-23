import java.io.BufferedReader;
import java.io.FileReader;

/**
 * readfile
 */
public class readfile {
public static void main(String[] args) {
    Product_details[] p=new Product_details[19923];
    int i=0;   
    String pid,product_name,brand,product_url;
    int retail_price,discounted_price,product_rating;
    try{
        FileReader f=new FileReader("data//flipkart_product_sample.csv");
        BufferedReader b=new BufferedReader(f);
        String line;
        while((line=b.readLine())!=null){
            String[] conv=line.split(",");
            pid=conv[0];
            product_name=conv[1];
            brand=conv[2];
            product_url=conv[3];
            retail_price=Integer.parseInt(conv[4]);
            discounted_price=Integer.parseInt(conv[5]);
            product_rating=Integer.parseInt(conv[6]);
            p[i]=new Product_details(pid,product_name,brand,product_url,retail_price,discounted_price,product_rating);
            i++;
        }
    }catch(Exception e){
       // System.out.println(e.getMessage());
    }
    Sorting s=new Sorting();
    s.sort(p,i);
}
}