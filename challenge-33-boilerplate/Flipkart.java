import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
class Flipkart {
    public static void main(String[] args) {
        try{
            ArrayList<Filedata> arr=new ArrayList<>();
            FileReader fr= new FileReader("./data/flipkart_product_sample.csv");
            BufferedReader br = new BufferedReader(fr);
            Filedata[] filedata= new Filedata[13800];
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
            int end=filedata.length-1;
        long st1 = System.currentTimeMillis();
        
            br.close();
        fr.close();
        Sort s = new Sort();
        long st = System.currentTimeMillis();
        
        s.sort(filedata,0, end);
        s.writePrice(filedata);
        long en = System.currentTimeMillis();
        System.out.println("Time Taken(ms)- " + (en - st) + "\n");
            
        task2 s1=new task2();
        s1.sort(filedata, 0, end);
        s1.writeRating1(filedata);
        long en1 = System.currentTimeMillis();
        System.out.println("Time Taken(ms)- " + (en1 - st1));

        
         }catch(Exception e){}
          
    }
}
