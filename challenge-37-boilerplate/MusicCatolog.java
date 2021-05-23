import java.io.BufferedReader;
import java.io.FileReader;

/**
 * MusicCatolog
 */
public class MusicCatolog {

    public static void main(String[] args) {
    BufferedReader br = null;
    String line=null;

        try{
            FileReader fr = new FileReader("./data/music-catalog.csv");
            br = new BufferedReader(fr);
            Playlist p = new Playlist();
             line = br.readLine();
             
            while(line != null){
                MusicItem musicItem = new MusicItem(line);
                // System.out.println("111");
                 p.storedetails(musicItem);
                 
                 line = br.readLine();
            }
             p.show();
        }catch(Exception e){
            // System.out.println("----");
        }
}
    
}