import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException{
        SinglyLinkedList list = new SinglyLinkedList();

        BufferedReader br = null;
        try{
            FileReader fr = new FileReader("data//daffodils.txt");
            br = new BufferedReader(fr);

            String line = br.readLine();
            
            while(line != null){
                line = line.toLowerCase().replaceAll("[,':;.?]", "");
               String[] words = line.split(" ");
                for(String word: words){
                    list.insert(new Word(word));
                }

                line = br.readLine();
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            br.close();
        }

        list.showWordList();
        list.sortList();
       list.showWordList();
       list.printReverseOrder(list.head);
        list.showFrequentWords();
    }
    
}
