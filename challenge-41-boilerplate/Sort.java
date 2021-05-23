import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Sort {
    public void sortprice(ArrayList<Filedata> list ){
        for(int i=0;i<list.size();i++){
        Collections.sort(list,new MyComparator());
    }
    try {
        FileWriter fw = new FileWriter("F:/niit/week-3/challenge-41-boilerplate/data/price.txt");
        fw.append("Product_id,");
        fw.append("product_name,");
        fw.append("brand,");
        fw.append("product_url,");
        fw.append("retail_price,");
        fw.append("discounted_price,");
        fw.append("product_rating");
        fw.append("\n");
       for (int i = 0; i < list.size(); i++) {
            fw.write(list.get(i).toString()+"\n");
       }
       fw.close();
        } catch (IOException e) {
        e.printStackTrace();
        }
}
    
    //for(int i=0;i<5;i++){
    // try{
    //     System.out.println(list.get(i));
    //     FileWriter fw =new FileWriter("data/price.txt");
    //    // BufferedWriter b=new BufferedWriter(fw);
    //    //String str=list.get(i).toString(); 
    //     fw.write(list.get(i).brand+" "++"\n");
    // }catch(Exception e){}
    class MyComparator implements Comparator{

        @Override
            public int compare(Object o1, Object o2) {
                Filedata st1= (Filedata)o1;
                Filedata st2= (Filedata)o2;
                Integer i1=new Integer(st2.retail_price);
                Integer i2=new Integer(st1.retail_price);
                return i1.compareTo(i2);
            }
    }
    public void sortrating(ArrayList<Filedata> list ){
        for(int i=0;i<list.size();i++){
        Collections.sort(list,new MyComparator1());
    }
    try {
        FileWriter fw = new FileWriter("F:/niit/week-3/challenge-41-boilerplate/data/rating.txt");
        fw.append("Product_id,");
        fw.append("product_name,");
        fw.append("brand,");
        fw.append("product_url,");
        fw.append("retail_price,");
        fw.append("discounted_price,");
        fw.append("product_rating");
        fw.append("\n");
       for (int i = 0; i < list.size(); i++) {
            fw.write(list.get(i).toString()+"\n");
       }
       fw.close();
        } catch (IOException e) {
        e.printStackTrace();
        }
}
    class MyComparator1 implements Comparator{

        @Override
            public int compare(Object o1, Object o2) {
                Filedata st1= (Filedata)o1;
                Filedata st2= (Filedata)o2;
                Integer i1=new Integer(st2.product_rating);
                Integer i2=new Integer(st1.product_rating);
                return i1.compareTo(i2);
            }
    }    
}
