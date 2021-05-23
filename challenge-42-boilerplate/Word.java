public class Word {
    String word;
    int count;
    
    Word(String word){
        this.word = word;
        this.count = 1;
    }

    @Override
    public String toString() {
        return "[count=" + count + ", word=" + word + "]";
    }
    
}
