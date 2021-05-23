public class MusicItem implements Comparable {
    String releaseType;
    String artist;
    String musicItemName;
    String genre;
    int yearOfRelease;
    int numberOfSongs;
    String totalPlayingtTime;

    MusicItem(String music) {
        String[] detail = music.split(", ");

        releaseType = detail[0];
        artist = detail[1];
        musicItemName = detail[2];
        genre = detail[3];
        yearOfRelease = Integer.parseInt(detail[4]);
        numberOfSongs = Integer.parseInt(detail[5]);
        totalPlayingtTime = detail[6];
    }

    @Override
    public String toString() {
        return "MusicItem [artist=" + artist + ", genre=" + genre + ", musicItemName=" + musicItemName
                + ", numberOfSongs=" + numberOfSongs + ", releaseType=" + releaseType + ", totalPlayingtTime="
                + totalPlayingtTime + ", yearOfRelease=" + yearOfRelease + "]";
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
