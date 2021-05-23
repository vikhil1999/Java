import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class BinaryTree {
    int j=0;
    TreeSet<Word> t=new TreeSet<Word>(new MyComparator());
    LinkedList<Word> t1=new LinkedList<>();
    public void insert(String word){
        if(word.length()==0){
            return;
        }
        if(t.isEmpty()){
            t.add(new Word(word.toLowerCase()));
            t1.add(new Word(word.toLowerCase()));
        }
        else{
            j=0;
           Iterator<Word> i=t.iterator();
            while(i.hasNext())
            {   Word temp=i.next();
                if(word.compareToIgnoreCase(temp.word)==0)
                {
                    temp.count+=1;
                    j++;
                }
            }
        if(j==0)
        {
            t.add(new Word(word.toLowerCase()));
            t1.add(new Word(word.toLowerCase()));
        }
        }
    }
    public void insert1(String word){
        if(word.length()==0){
            return;
        }
        if(t1.isEmpty()){
            t1.add(new Word(word.toLowerCase()));
        }
        else{
            j=0;
           Iterator<Word> i=t1.iterator();
            while(i.hasNext())
            {   Word temp=i.next();
                if(word.compareToIgnoreCase(temp.word)==0)
                {
                    temp.count+=1;
                    j++;
                }
            }
        if(j==0)
        {
            t1.add(new Word(word.toLowerCase()));
        }
    }
    }
    public void show(){
        Iterator<Word> i=t.iterator();
            while(i.hasNext())
            {   Word temp=i.next();
                t1.add(temp);
                System.out.println(temp.word+" "+temp.count);
            }
            System.out.println("------------Descending Order----------------");
        TreeSet<Word> desc = (TreeSet<Word>) t.descendingSet();
        Iterator<Word> i1=desc.iterator();
            while(i1.hasNext())
            {   Word temp=i1.next();
                System.out.println(temp.word+" "+temp.count);
            }
    }
    public void show1(){
        System.out.println("-------------COUNT----------");
        Collections.sort(t1,new MyComparator1());
        Iterator<Word> i=t1.iterator();
            while(i.hasNext())
            {   Word temp=i.next();
                System.out.println(temp.word+" "+temp.count);
            }
    }
}
class MyComparator implements Comparator{

    @Override
        public int compare(Object o1, Object o2) {
            Word st1= (Word)o1;
            Word st2= (Word)o2;
            return st1.word.compareTo(st2.word);
        }
}
class MyComparator1 implements Comparator{

    @Override
        public int compare(Object o1, Object o2) {
            Word st1= (Word)o1;
            Word st2= (Word)o2;
            Integer i1=st1.count;
            Integer i2=st2.count;
            if(i2>i1){
                return 1;
            }
            if(i2<i1){
                return -1;
            }
            else{
                return 0;
            }

            // return i2.compareTo(i1);
            // return st1.word.compareTo(st2.word);
        }
}

