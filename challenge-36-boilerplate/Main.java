import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException{
        MusicCatalog musicCatalog = new MusicCatalog();
        
        if(musicCatalog.readMusicCatalog("data//music-catalog.csv")){
            System.out.println("**Music Catalog creation successful**");
        }else{
            System.out.println("!!Music Catalog creation failed!!");
        }

        System.out.println();
        musicCatalog.showMusicCatalog(Direction.FORWARD);
        
        System.out.println();
        musicCatalog.showMusicCatalog(Direction.BACKWARD);
    }    
}
