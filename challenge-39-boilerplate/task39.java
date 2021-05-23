import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class task39
{
    public static void main(String[] args) 
    {
        tree t = new tree();
        try 
        {
            FileReader file = new FileReader("./data/daffodils.txt");
            BufferedReader buff = new BufferedReader(file);
            String str = buff.readLine();
            
            while(str!=null)
            {
                String []data =str.split("[-, :;/.]");
                for (String string : data) 
                {
                    t.insertAT(t.root, string);    
                }
                str = buff.readLine();
            }
            System.out.println();
        } catch (Exception e) 
        {
            System.out.println(e);    
        }  
        System.out.println("Words\tCount");
        t.show(t.root);
        System.out.println("Size : "+t.size());
        System.out.println();
        System.out.println("Reverse Order");
        System.out.println("Words");
        t.reverseNode(t.root);
        System.out.println();
        System.out.println("In descending order of Frequency");
        System.out.println("Words\tCount");
        t.showFrequentWords();
        
    }
}
class Word
{
    String words;
    int no;

    Word(String W)
    {
        this.words=W;
        this.no=1;
    }
}
class TNode
{
    Word word;
    TNode left;
    TNode right;
    
    TNode(Word w)
    {
        this.word=w;
    }
    
    public boolean hasleft()
    {
        if(this.left!=null)
        {
            return true;
        }
        else
        return false;

    }  
    
    public boolean hasright()
    {
        if(this.right!=null)
        {
            return true;
        }
        else
        return false;
    }
    
    public boolean isInternal()
    {
        if(this.left!=null || this.right!=null)
        {
            return true;
        }
        else return false;
    }
    public boolean isExternal()
    {
        if(this.left==null && this.right==null)
        {
            return true;
        }
        return false;
    } 
}

class tree
{
    TNode root = null;
    int size =0;
    
    public int size()
    {
        return this.size;
    }
    
    boolean isEmpty()
    {
        if(this.root!=null)
        {
            return false;
        }
        else return true;
    }
    
    public void insertAT(TNode root , String word)
    {
        if(word.length()==0){return;}
        if(this.root==null)
        {
            if(this.root==null)
            {
                this.root = new TNode(new Word(word));
                size = 1;
            }
        }
        else if(root!=null)
        {
            if(word.compareToIgnoreCase(root.word.words)<0)
            {
                if(root.hasleft()==false)
                {
                    root.left=new TNode(new Word(word));
                    size++;
                }
                else
                {
                    insertAT(root.left, word);
                }
            }
            else if(word.compareToIgnoreCase(root.word.words)>0)
            {
                if(root.hasright()==false)
                {
                    root.right =new TNode(new Word(word));
                    size++;
                }
                else
                {
                    insertAT(root.right, word);
                }
            }
            else
            {
                root.word.no++;
            }
        }
    }
    
    public void show(TNode root)
    {
        if(root==null)
        {return;}
        show(root.left);
        System.out.println(root.word.words+"\t"+root.word.no);
        show(root.right);
    }
    
    public void reverseNode(TNode rev)
    {
        
        if(rev==null)
        {
            return;
        }
        reverseNode(rev.right);
        System.out.println(rev.word.words);
        reverseNode(rev.left);
    }
    
    public void showFrequentWords()
    {
        ArrayList<String>words = new ArrayList<>();
        ArrayList<Integer>number = new ArrayList<>();
        getWords(root , words , number);
        
        for (int i = 0; i < words.size(); i++) 
        {
            int index = i;
            for (int j = i+1; j < words.size(); j++) 
            {
                if(number.get(index)<number.get(j))
                {
                    index=j;
                }    
                else if(number.get(index)==number.get(j))
                {
                    if(words.get(j).compareToIgnoreCase(words.get(index))<0)
                    {
                        index = j;
                    }
                }
            } 
            Collections.swap(words, index, i);
            Collections.swap(number, index, i);   
        }
        for (int i = 0; i < words.size(); i++) 
        {
            System.out.println(words.get(i)+"\t"+number.get(i));    
        }
    }
    
    private void getWords(TNode root2, ArrayList<String> words, ArrayList<Integer> number) 
    {
        if(root2==null)
        {return;}
        getWords(root2.left, words, number);
        words.add(root2.word.words);
        number.add(root2.word.no);
        getWords(root2.right, words, number);
    }
}