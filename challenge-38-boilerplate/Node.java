public class Node {
    Word wordData;
    Node left;
    Node right;
    public Node(Word wordData) {
        this.wordData = wordData;
        this.left = null;
        this.right = null;
    }
    public Node left(){
        if(left!=null){
            return left;
        }
        return null;
    }
    public Node right(){
        if(right!=null){
            return right;
        }
        return null;
    }
    public boolean hasLeft(){
        if(left!=null){
            return true;
        }
        return false;
    }
    public boolean hasRight(){
        if(right!=null){
            return true;
        }
        return false;
    }
    public boolean isInternal(){
        if(right!=null || left!=null){
            return true;
        }
        return false;
    }
    public boolean isExternal(){
        if(right==null && left==null){
            return true;
        }
        return false;
    }
    public Node insertLeft(Node newLeftChild){
        if(left==null){
            left = newLeftChild;
        }
        return left;
    }
    public Node insertRight(Node newRightChild){
        if(right==null){
            right = newRightChild;
        }
        return right;
    }
    
}

