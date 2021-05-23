import java.io.BufferedReader;
import java.io.FileReader;

public class Challenge33 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("./data/flipkart_product_sample.csv"); 
        BufferedReader br = new BufferedReader(fr);
        String line;
        Details d = new Details();
        Details d1[] = new Details[19922];
        Details d2[] = new Details[19922];
        Float f[] = new Float[19922];
        Float a[] = new Float[19922];
        int j = 0;
        try {
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] obj = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                d.setPid(obj[0]);
                d.setProduct_name(obj[1]);
                d.setBrand(obj[2]);
                d.setProduct_url(obj[3]);
                d.setRetail_price(Float.parseFloat(obj[4]));
                d.setDiscounted_price(Integer.parseInt(obj[5]));
                d.setProduct_rating(obj[6]);
                d1[j] = new Details(d.getPid(), d.getProduct_name(), d.getBrand(), d.getProduct_url(),
                        d.getRetail_price(), d.getDiscounted_price(), d.getProduct_rating());
                d2[j] = new Details(d.getPid(), d.getProduct_name(), d.getBrand(), d.getProduct_url(),
                        d.getRetail_price(), d.getDiscounted_price(), d.getProduct_rating());
                f[j] = d.getProduct_rating();
                a[j] = d.getRetail_price();
                j++;
            }
        } catch (Exception e) {

        }
        br.close();
        fr.close();
        EcomAna s = new EcomAna();

        long st = System.currentTimeMillis();
        s.quickSorting(d1, 0, 19921, f);
        s.writeRating(d1, f);
        long en = System.currentTimeMillis();
        System.out.println("Time Taken(ms)- " + (en - st) + "\n");

        long st1 = System.currentTimeMillis();
        s.quickSorting(d2, 0, 19921, a);
        s.writeRetail(d2, a);
        long en1 = System.currentTimeMillis();
        System.out.println("Time Taken(ms)- " + (en1 - st1));
    }
}
