import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SinglyLinkedList {
   // Node head;
   int j=0;
    LinkedList<Word> l=new LinkedList<>();
    public void insert(Word word){
        if(word.word.length() == 0) return;
        if(l.isEmpty()){
            l.add(word);
            return;
        }
        else{
            j=0;
           
            for(int i=0;i<l.size();i++){
                if(word.word.equals(l.get(i).word)){
                    l.get(i).count+=1;
                    j++;
                }
            }
        if(j==0){
            l.add(word);
        }
        }
    }

    public void showWordList(){
        System.out.printf("%-20s \t\t %s\n", "Word", "Count");
        for(int i=0;i<l.size();i++){
            
            System.out.printf("%-20s \t\t %d\n",l.get(i).word,l.get(i).count);
        }
    }
    public void showReverse(){
        System.out.println("---------------------Reverse---------------------");
        System.out.printf("%-20s \t\t %s\n", "Word", "Count");
        for(int i=l.size()-1;i>=0;i--){
            
            System.out.printf("%-20s \t\t %d\n",l.get(i).word,l.get(i).count);
        }
    }
    public void sort(){
        System.out.println("------------------Alphabetic Order----------------");
        for(int i=0;i<l.size();i++){
        Collections.sort(l,new MyComparator());
    }
    }
    public void sortcount(){
        System.out.println("------------------BASED ON COUNT----------------");
        for(int i=0;i<l.size();i++){
        Collections.sort(l,new MyComparator1());
    }
    }
    class MyComparator implements Comparator{

        @Override
            public int compare(Object o1, Object o2) {
                Word st1= (Word)o1;
                Word st2= (Word)o2;
                // Integer i1=new Integer(st2.word);
                // Integer i2=new Integer(st1.w);
                return st1.word.compareTo(st2.word);
            }
    }    
    class MyComparator1 implements Comparator{

        @Override
            public int compare(Object o1, Object o2) {
                Word st1= (Word)o1;
                Word st2= (Word)o2;
                Integer i1=new Integer(st2.count);
                Integer i2=new Integer(st1.count);
                return i1.compareTo(i2);
            }
    }
    
    
}
