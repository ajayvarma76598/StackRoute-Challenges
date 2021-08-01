public class linkedlist {
    private Node START;
    public void addnode(String item){
        if(!updateOccurance(item)){
            Word word = new Word(item,1);
            Node newNode = new Node();
            newNode.data = word;
            if(START==null){
                newNode.next = null;
                START = newNode;
            }else{
                Node currentNode = START;
                Node previous = null;
                while(currentNode!=null && currentNode.data.getWordtext().compareTo(item)<=0){
                    previous = currentNode;
                    currentNode = currentNode.next;
                }
                if(previous==null){
                    newNode.next = START;
                    START = newNode;
                }else{
                    previous.next = newNode;
                    newNode.next = currentNode;
                }
            }
        }        
    }
    public boolean updateOccurance(String item){
        if(START == null){
            return false;
        }
        Node currentNode = START;
        while(currentNode!=null){
            if(currentNode.data.getWordtext().equals(item)){
                currentNode.data.setWordoccurance(currentNode.data.getWordoccurance()+1);
                return true;
            }else{
                currentNode = currentNode.next;
            }
        }
        return false;
    }
    private void forwardTraverse(Node header){
        if(header == null){
            return;
        }
        System.out.println(header.data);
        forwardTraverse(header.next);
    }
    private void reverseTraverse(Node header){
        if(header == null){
            return;
        }
        reverseTraverse(header.next);
        System.out.println(header.data);
    }
    public Node showFrequentWords(Node header){
        Node HEAD = null;
        Node currentNode = header;
        while(currentNode!=null){
            Word word = currentNode.data;
            Node newNode =  new Node();
            newNode.data = word;
            if(HEAD ==null){
                newNode.next = null;
                HEAD =newNode;
            }else{
                Node current = HEAD;
                Node prev = null;
                while(current!=null && current.data.getWordoccurance()>=(word.getWordoccurance())){
                    prev = current;
                    current = current.next;
                }
                if(prev == null){
                    newNode.next = HEAD;
                    HEAD = newNode;
                }else{
                    prev.next =newNode;
                    newNode.next = current;
                }
            }
            currentNode = currentNode.next;
        }
        return HEAD;
    }
    public void printwords(TraversalDirection direction){
        switch(direction){
            case FORWARD:
                forwardTraverse(START);
                break;
            case REVERSE:
                reverseTraverse(START);
                break;
            case FREQUENCY:
                Node HEAD = showFrequentWords(START);
                forwardTraverse(HEAD);
                break;
        }
    }
}
