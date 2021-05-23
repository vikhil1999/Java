import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class MusicCatalog {
    Node head;
    Node tail;

    boolean readMusicCatalog(String filename) throws IOException{
        BufferedReader br = null;
        try{
            FileReader fr = new FileReader(filename);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while(line != null){
                MusicItem musicItem = new MusicItem(line);
                insertMusic(musicItem);

                line = br.readLine();
            }


        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            br.close();
        }

        return true;
    }

    void insertMusic(MusicItem musicItem){
        Node node = new Node(musicItem);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        else{
        Node temp = head;
        while(temp != null){
            if(!temp.musicItem.isInAscendingOrder(musicItem)){
                if(temp == head){
                    node.next = head;
                    head.prev = node;
                    head = node;
                 }
                 else{
                     temp.prev.next = node;
                     node.prev = temp.prev;
                     node.next = temp;
                     temp.prev = node;
                 }
                return;
            }
            
            temp = temp.next;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }
    }

    void showMusicCatalog(Direction direction){
        System.out.println("Release Type    " +  "Artist    " + "Music Item Name    " + "Genre    " + "Year of Release    " + "Number of Songs    " + "Total Playing Time");
        if(direction == Direction.FORWARD){
            Node temp = head;
            while(temp != null){
                temp.musicItem.showDetails();
                temp = temp.next;
            }
        }else if(direction == Direction.BACKWARD){
            Node temp = tail;
            while(temp != null){
                temp.musicItem.showDetails();
                temp = temp.prev;
            }
        }
    }
}
