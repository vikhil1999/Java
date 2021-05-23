import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

class Flipkart {
  public static void main(String[] args) {
      try{
          //ArrayList<Filedata> arr=new ArrayList<>();
          FileReader fr= new FileReader("data/flipkart_product_sample.csv");
          BufferedReader br = new BufferedReader(fr);
          Filedata[] filedata= new Filedata[19922];
          String[] list= new String[7];
          String line;
          int i=0,j=0;
          br.readLine();
          //System.out.println(i);
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
              //arr.add(filedata[i]);
              i++;
              // System.out.println(i);
          }
          searching s=new searching();
          Scanner o=new Scanner(System.in);
          System.out.println("Enter the Product_ID to search");
          String item=o.nextLine();
         s.linearserach(filedata, item);
          br.close();
      }catch(Exception e){
      }
      
  }
}