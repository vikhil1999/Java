import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class TextV2 {
    public static void main(String[] args) throws IOException{
        BinaryTree tree = new BinaryTree();

        
        try{
            FileReader f = new FileReader("data//daffodils.txt");
            BufferedReader b = new BufferedReader(f);

            String line = b.readLine();
            while(line != null){
                String[] words = line.split("[-, :;/.]");

                for(String word: words){
                    tree.insert(word);
                    // tree.insert1(word);
                }
                line = b.readLine();
            }
            // System.out.println();

        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println( "Word\t\t\tFrequency");
        tree.show();
        System.out.println( "Word\t\t\tFrequency");
        tree.show1();
        // System.out.println("Total size of tree: " + tree.s;
    }    
}
