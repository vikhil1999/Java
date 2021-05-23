public class BinaryTree {
    TreeNode root = null;
    int size = 0;


    void insert(TreeNode root, String word){
        if(word.length() == 0) return;
        
        if(this.root == null){
            addRoot(word);
        }else if(root != null){
            if(word.compareToIgnoreCase(root.word.word) < 0){
                if(root.hasLeft() == false){
                    root.left = new TreeNode(new Word(word));
                    size += 1;
                }else{
                    insert(root.left, word);
                }
                
            }else if(word.compareToIgnoreCase(root.word.word) > 0){
                if(root.hasRight() == false){
                    root.right = new TreeNode(new Word(word));
                    size += 1;
                }else{
                    insert(root.right, word);
                }
            }else{
                root.word.count += 1;
            }
        }
    }

    void showTree(TreeNode root){
        if(root == null){
            return;
        }
        showTree(root.left);
        System.out.printf("%-20s \t %d\n", root.word.word,  root.word.count);
        showTree(root.right);
    }

    void addRoot(String word){
        if(this.root == null){
            this.root = new TreeNode(new Word(word));
            size = 1;
        }
    }

    int size(){
        return this.size;
    }

    boolean isEmpty(){
        if(this.root == null){
            return true;
        }
        return false;
    }

}
