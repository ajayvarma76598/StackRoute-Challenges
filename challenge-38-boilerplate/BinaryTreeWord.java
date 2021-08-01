public class BinaryTreeWord {
    Node ROOT;
    public BinaryTreeWord() {
        this.ROOT = null;
    }
    public void insertNode(String wordItem){
        if(!updateRepeatation(wordItem)){
            Word word = new Word(wordItem);
            Node newNode = new Node(word);
            if(isEmpty()){
                addRoot(newNode);
            } else {
                Node current = ROOT;
                Node parent = null;
                while(current!=null){
                    parent = current;
                    if (newNode.wordData.getWord_element().compareTo(current.wordData.getWord_element()) < 0) {
                        current = current.left();
                    } else {
                        current = current.right();
                    }
                }
                if(parent==null){
                    ROOT = newNode;
                } else {
                    if (newNode.wordData.getWord_element().compareTo(parent.wordData.getWord_element()) < 0) {
                        parent.insertLeft(newNode);
                    } else {
                        parent.insertRight(newNode);
                    }
                }
            }
        }
    }
    public boolean updateRepeatation(String wordItem){
        if(ROOT==null){
            return false;
        }
        Node current = ROOT;
        while(current!=null){
            if(current.wordData.getWord_element().equals(wordItem)){
                current.wordData.setFrequency(current.wordData.getFrequency()+1);
                return true;
            } else if (wordItem.compareTo(current.wordData.getWord_element())<0){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }
    public int size(Node node){
        if(node == null){
            return 0;
        }
        return 1 + size(node.left()) + size(node.right());
    }
    public int size(){
        return size(ROOT);
    }
    public int totalWords(Node node){
        if(node == null){
            return 0;
        }
        return node.wordData.getFrequency() + totalWords(node.left()) + totalWords(node.right());
    }
    public int totalWords(){
        return totalWords(ROOT);
    }
    public boolean isEmpty(){
        if(ROOT==null){
            return true;
        }
        return false;
    }
    public Node addRoot(Node nodeRoot){
        ROOT = nodeRoot;
        return ROOT;
    }
    public void showTree(Node root) {
        if (root == null) {
            return;
        }
        showTree(root.left());
        System.out.println(root.wordData);
        showTree(root.right());
    }
    public void showTree(){
        showTree(ROOT);
    }
}

