import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class Flipkart {
    public static void main(String[] args) {
        try{
            ArrayList<Filedata> arr=new ArrayList<>();
            FileReader fr= new FileReader("./data/flipkart-product-sample.csv");
            BufferedReader br = new BufferedReader(fr);
            Filedata[] filedata= new Filedata[19922];
            String[] list= new String[7];
            String line;
            int i=0,j=0;
            br.readLine();
            System.out.println(i);
            while((line=br.readLine())!=null){
                    // pid,product_name,brand,product_url,retail_price,discounted_price,product_rating
                list=line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                // System.out.println(i);
                try{
                if(list[6].equals("No rating available"))
                 {
                    j=0;
                 }
                 else{
                 j=Integer.parseInt(list[6]);
                 }}catch(Exception e){}
                filedata[i]=new Filedata(list[0], list[1], list[2], list[3], Integer.parseInt(list[4]), Integer.parseInt(list[5]), j);
                arr.add(filedata[i]);
                i++;
                // System.out.println(i);
            }
            br.close();
            System.out.println(i);
            System.out.println(arr.get(0));
            Sort s=new Sort();
            s.sortprice(arr);
            s.sortrating(arr);
            
            //flipkartsorteddatainprice(filedata, "week3\\challenge-32-boilerplate\\data\\flipkart_sorted_data_in_price.txt");
            // flipkartsorteddatainrating(list, "./data/flipkart_data_in_sorted_along_rating.txt");
        }catch(Exception e){
        }
    }
}