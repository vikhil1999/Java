import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Sorting {
    int i=0,j=0;
    Product_details temp;
    public void sort(Product_details[] p,int k){
        for(i=0;i<k;i++){
            for(j=0;j<k-i-1;j++){
                if(p[j].getretailprice()>p[j+1].getretailprice()){
                    temp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=p[j];
                }
            }
        }
        for(i=1;i<19923;i++){
            try{
            FileWriter f=new FileWriter("F://niit//week-3//challenge-32-boilerplate//word.txt");
                f.write(p[i].getpid()+","+p[i].getname()+","+p[i].getbrand()+","+p[i].geturl()+","+p[i].getretailprice()+","+p[i].getdiscount()+"\n");
            }catch(FileNotFoundException Fio){
             System.out.println(Fio.getMessage());
            }catch(IOException io){
                 System.out.println(io.getMessage());
            }
        }

    }
}
