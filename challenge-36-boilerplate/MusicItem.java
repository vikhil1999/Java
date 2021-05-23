public class MusicItem {
    String releaseType;
    String artist;
    String musicItemName;
    String genre;
    int yearOfRelease;
    int numberOfSongs;
    String totalPlayingtTime;

    MusicItem(String music){
        String[] detail = music.split(", ");
        
        releaseType = detail[0];
        artist = detail[1];
        musicItemName = detail[2];
        genre = detail[3];
        yearOfRelease = Integer.parseInt(detail[4]);
        numberOfSongs = Integer.parseInt(detail[5]);
        totalPlayingtTime = detail[6];
    }

    void showDetails(){
        System.out.println(releaseType + "    " + artist + "    " + musicItemName + "    " + genre + "    " + yearOfRelease + "    " + numberOfSongs + "    " + totalPlayingtTime);;
    }

    boolean isInAscendingOrder(MusicItem newItem){
        if(this.artist.compareToIgnoreCase(newItem.artist) < 0){
            return true;
        }else if(this.artist.compareToIgnoreCase(newItem.artist) == 0){
            if(this.yearOfRelease <= newItem.yearOfRelease){
                return true;
            }
        }

        return false;
    }
}
