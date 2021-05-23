public class TreeNode {
    Word word;
    TreeNode right;
    TreeNode left;

    TreeNode(Word word){
        this.word = word;
    }
    boolean hasLeft(){
        if(this.left != null){
            return true;
        }
        return false;
    }

    boolean hasRight(){
        if(this.right != null){
            return true;
        }
        return false;
    }
}
