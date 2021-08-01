public class LinkedListWord {
    Node START;
    public void insertNode(String wordItem){
        if(!updateRepeatation(wordItem)){
            Word word = new Word(wordItem);
            Node newNode = new Node(word);
            if(START==null){
                newNode.next = null;
                START = newNode;
            } else {
                Node current = START;
                Node previous = null;
                while(current!=null && (current.wordData.getWord_element().compareTo(wordItem)<=0)){
                    previous = current;
                    current = current.next;
                }
                if(previous==null){
                    newNode.next = START;
                    START = newNode;
                } else {
                    previous.next = newNode;
                    newNode.next = current;
                }
            }
        }
    }
    public boolean updateRepeatation(String wordItem){
        if(START==null){
            return false;
        } 
        Node current = START;
        while(current!=null){
            if(current.wordData.getWord_element().equals(wordItem)){
                current.wordData.setFrequency(current.wordData.getFrequency()+1);
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }
    public String maxFrequent(){
        Node current = START;
        Word word;
        if(START==null){
            return null;
        } else {
            word = START.wordData;
            while(current!=null){
                if(word.getFrequency()<current.wordData.getFrequency()){
                    word = current.wordData;
                }
                current = current.next;
            }
        }
        return word.getWord_element();
    }
    private void forwardDirection(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.wordData);
        forwardDirection(head.next);
    }
    private void reverseDirection(Node head){
        if(head==null){
            return;
        }
        reverseDirection(head.next);
        System.out.println(head.wordData);
    }
    public Node showFrequentWords(Node header){
        Node HEAD = null;
        Node current = header;
        while(current!=null){
            Word word = current.wordData;
            Node newNode = new Node();
            newNode.wordData = word;
            if(HEAD==null){
                newNode.next = null;
                HEAD = newNode;
            } else {
                Node currentNode = HEAD;
                Node previous = null;
                while(currentNode!=null && (currentNode.wordData.getFrequency())>=(word.getFrequency())){
                    previous = currentNode;
                    currentNode = currentNode.next;
                }
                if(previous==null){
                    newNode.next = HEAD;
                    HEAD = newNode;
                } else {
                    previous.next = newNode;
                    newNode.next = currentNode;
                }
            }
            current = current.next;
        }
        return HEAD;
    }
    public void showWordList(Direction direction){
        switch(direction){
            case FORWARD : {
                forwardDirection(START);
            } break;
            case REVERSE : {
                reverseDirection(START);
            } break;
            case FREQUENCY : {
                Node HEADEST = showFrequentWords(START);
                forwardDirection(HEADEST);
            } break;
        }
    }
}

