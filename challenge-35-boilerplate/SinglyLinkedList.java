public class SinglyLinkedList {
    Node head;
    public void insert(Word word){
        if(word.word.length() == 0) return;
        Node node = new Node(word);
        if(head == null){
            head = node;
            return;
        }
        if(findWord(word) != null){
            findWord(word).word.count += 1;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public Node findWord(Word word){
        Node temp = head;
        while(temp != null){
            if(temp.word.word.equals(word.word)){
                return temp;
            }
            temp = temp.next;
        }
            return null;
    }
    public void showWordList(){
        Node temp = head;
        System.out.printf("%-20s \t\t %s\n", "Word", "Count");
        while(temp != null){
            System.out.printf("%-20s \t\t %d\n", temp.word.word, temp.word.count);
            temp =  temp.next;
        }
    }
    
    public void sortList(){
        if(head == null || head.next == null){
            return;
        }
        Node curr = head;
        while(curr.next != null){
            Node ptr = head;
            while(ptr.next != null){
                if(ptr.word.word.compareToIgnoreCase(ptr.next.word.word) > 0){
                    swap(ptr, ptr.next);
                }
                ptr = ptr.next;
            }
            curr = curr.next;
        }
    }
    public void printReverseOrder(Node start){
        if(start == null){
            System.out.println("List in reverse order.");
            return;
        }
        printReverseOrder(start.next);
        System.out.println(start.word.word);
    }
    public void showFrequentWords(){
        sortListOnFrequency();
        System.out.println("Words in descending order of frequency.");
        showWordList();
    }
    public void sortListOnFrequency(){
        if(head == null || head.next == null){
            return;
        }
        Node curr = head;
        while(curr.next != null){
            Node ptr = curr;
            Node max_ptr = curr;
            
            while(ptr != null){
                if(max_ptr.word.count < ptr.word.count){
                    max_ptr = ptr;
                }else if(max_ptr.word.count == ptr.word.count){
                    if(max_ptr.word.word.compareToIgnoreCase(ptr.word.word) > 0){
                        max_ptr = ptr;
                    }
                }
                ptr = ptr.next;
            }
            swap(curr, max_ptr);
            curr = curr.next;
        }
    }
    public void swap(Node a, Node b){
        Word temp = a.word;
        a.word = b.word;
        b.word = temp;
    }
}
