import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class file {
    public static void main(String[] args) {
    String Date,Payment_method,line,a;
    String Customer_id,Product_category,Clicks_in_site;
    String Value,Time_on_site;
    int i=0,j=0,k=0,h=0,l=0,m=0,min_value=0,max_value=0,q=0,w=0;
    String[] arr=new String[24999];
    ecommerce[] e=new ecommerce[24999];
    try{
    FileReader f=new FileReader("F://niit//week2-day2//challenge-31-boilerplate-ecommerce//data//purchase_details.csv");
    BufferedReader b=new BufferedReader(f); 
    while((line=b.readLine())!=null){
        String[] conv=line.split(",");
        Date=conv[0];
        Customer_id=conv[1]; 
        Product_category=conv[2];
        Payment_method=conv[3];
        Value=conv[4];
        Time_on_site=conv[5];
        Clicks_in_site=conv[6];
        if(Date!=null&&Customer_id!=null&&Product_category!=null&&Payment_method!=null&&Value!=null&&Time_on_site!=null&&Clicks_in_site!=null)
        {
        e[i]=new ecommerce(Date,Customer_id,Product_category,Payment_method,Value,Time_on_site,Clicks_in_site);
        i++;
        }
    }
    }
    catch(Exception ko){
    System.out.println(ko);
    } 
    System.out.println("The Unique product Categories sold are :");
    for(i=0;i<24999;i++){
        k=0;
        for(j=0;j<h;j++)
        {
            if(e[i].getProduct_category().equals(arr[j])){
                k++;
            }
        }j=0;
        if(k==0){
            arr[h]=e[i].getProduct_category();
            System.out.print(arr[h]+",");
            h++;
        }
    }
    System.out.println(); 
    System.out.println("Totally there are "+h+" Unique Product Categories which has been sold ");
    int[] unique=new int[h];
    int[] unique1=new int[h];
    double[] amount=new double[h];
    Arrays.fill(unique, 0); 
    for(i=l;i<24999;i++){

        for(j=l;j<24999;j++){
            m=j;
            if(e[i].getDate().equals(e[j].getDate())){
                for(k=0;k<h;k++){
                    if(e[j].getProduct_category().equals(arr[k])){
                        int kk=unique[k];
                            kk++;
                            unique[k]=kk;
                        int kk1=unique1[k];
                            kk1++;
                            unique1[k]=kk1;
                        double amount1=amount[k];
                            amount1+=Double.parseDouble(e[j].getValue());
                            amount[k]=amount1;

                    }
                }
            }
            else{
                break;
            }
        }
                max_value=unique[0];
                q=0;
                 for(k=1;k<h;k++){
                    if(unique[k]>max_value){
                        max_value=unique[k];
                        q=k;
                        
                    }
                }
                min_value=unique[0];
                w=0;
                for(k=1;k<h;k++){
                    if(unique[k]<min_value){
                        min_value=unique[k];
                    w=k;
                    }
                }
                System.out.println("On "+e[i].getDate()+" Highest sold Product Categorie is "+arr[q]+" and Lowest sold Product Categorie is "+arr[w]);
                Arrays.fill(unique, 0);
                
                l=m;
                i=l;
    }
    l=0;
    m=0; 
    for(i=0;i<24999;i++){
        if("credit".equals(e[i].getPayment_method())){
        l++;
        }
       else{
        m++;
    }
    }
    if(l>m){
        System.out.println("The most prefered mode of Payment is credit and is used by "+l+" customers");
    }
    else{
        System.out.println("The most prefered mode of Payment is paypal and is used by "+m+" customers");
    }
    max_value=unique1[0];
    q=0;
    for(k=1;k<h;k++){
        if(unique1[k]>max_value){
            max_value=unique1[k];
            q=k;                
        }
    }
    System.out.println("The Maximum Sold Product Categorie is "+arr[q]);
    double max_value1=amount[0];
    q=0;
    for(k=1;k<h;k++){
        if(amount[k]>max_value1){
            max_value1=amount[k];
            q=k;                    
        }
    }
    q=0;
    m=0;
    k=0;
    System.out.format("The Product Category %s has generated maximum sales of value %.2f",arr[q],max_value1);
    for(i=0;i<24999;i++){
        float aa=Float.parseFloat(e[i].getTime_on_site());
        k+=Integer.parseInt(String.valueOf(e[i].getClicks_in_site()));
       // System.out.print(e[i].getClicks_in_site()+",");
        if(aa>15){
            q++;
        }
        else{
            m++;
        }
    }
    System.out.println();
    if(q>m){
    System.out.println("Spending More time generates More sales and the number of sales are "+q);
    }
    else{
    System.out.println("Spending Less time generates More sales and the number of sales are "+m); 
    }
    k/=24999;
    System.out.println("The average number of Clicks made by Customer before Purchase is "+k);

}
} 
