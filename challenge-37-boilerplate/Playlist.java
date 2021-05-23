import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Playlist {
    Queue<MusicItem> q=new PriorityQueue<>();
    Stack<MusicItem> s=new Stack<>();
    public void storedetails(MusicItem obj){
       q.offer(obj);
       s.push(obj);
    }
    public void show(){
    System.out.println("Removing the oldest Song and the Song is");
   System.out.println(q.remove().toString());
    System.out.println("Removing the Latest added Song and Song is");
    System.out.println(s.pop().toString());
    }
}
