import java.io.FileWriter;

public class EcomAna {
    // using Quick Sort
    public  int partition(Details d1[], int left, int right, Float F[]) {
        Float pivot = F[left];
        int i = left;
        try {
            for (int j = left + 1; j <= right; j++) {
                if (F[j] > pivot) {
                    i = i + 1;
                    Float temp = F[i];
                    F[i] = F[j];
                    F[j] = temp;
                    Details tem = d1[i];
                    d1[i] = d1[j];
                    d1[j] = tem;
                }
            }
            Float temp = F[i];
            F[i] = F[left];
            F[left] = temp;

            Details tem = d1[i];
            d1[i] = d1[left];
            d1[left] = tem;
        } catch (Exception e) {

        }

        return i;

    }

    public  void quickSorting(Details d1[], int left, int right, Float F[]) {
        try {
            if (left < right) {
                int q = partition(d1, left, right, F);
                quickSorting(d1, left, q, F);
                quickSorting(d1, q + 1, right, F);
            }

        } catch (Exception e) {

        }
    }

    public void writeRating(Details d1[], Float F[]) {
        System.err.println("Sorted Based on rating");
        try {
            FileWriter mywrite = new FileWriter("Ratingsorted.txt");
            for (int i = 0; i < 19922; i++) {
                mywrite.write("Rating:-  " + F[i] + "  " + d1[i].getPid() + "," + d1[i].getProduct_name() + ","
                        + d1[i].getBrand() + "," + d1[i].getProduct_url() + "," + d1[i].getProduct_rating() + ","
                        + d1[i].getDiscounted_price() + "\n");

            }
            mywrite.close();
        } catch (Exception e) {

        }
        System.out.println("Successful !");

    }

    
    public void writeRetail(Details d2[], Float a[]) {
        System.out.println("Sorted Based on retail");
        try {
            FileWriter mywri = new FileWriter("Retailsorted.txt");
            for (int i = 0; i < 19922; i++) {
                mywri.write("Retail_price:-  " + a[i] + "  " + d2[i].getPid() + "," + d2[i].getProduct_name() + ","
                        + d2[i].getBrand() + "," + d2[i].getProduct_url() + "," + d2[i].getDiscounted_price() + "\n");
            }
            mywri.close();
        } catch (Exception e) {

        }
        System.out.println("Successful !");
    }

}
