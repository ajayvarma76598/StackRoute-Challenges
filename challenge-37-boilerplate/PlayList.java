public class PlayList {
    public Node FRONT;
    public Node REAR;
    public PlayList() {
        FRONT = null;
        REAR = null;
    }
    public void insert(Songs songs) {
        Node newNode = new Node(songs);
        newNode.next = null;
        if (REAR == null) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.next = newNode;
            REAR = newNode;
        }
    }
    public void remove() {
        Node temp;
        if (FRONT == null) {
            System.out.println("Queue underflow");
        } else {
            temp = FRONT;
            FRONT = FRONT.next;
            System.out.println("Element removed - " + temp.songs.getRelease_Type() + " " + temp.songs.getArtist() + " "
                    + temp.songs.getMusic_Item_Name() + "" + temp.songs.getGenre() + " " + temp.songs.getYear_of_Release()
                    + " " + temp.songs.getNumber_of_Songs() + " " + temp.songs.getTotal_Playing_Time());
        }
    }
    public void traverse() {
        Node previous, current;
        previous = null;
        if (FRONT == null) {
            System.out.println("Queue underflow");
        } else {
            current = FRONT;
            while (current != null) {
                System.out.println(current.songs.getRelease_Type() + " " + current.songs.getArtist() + " "
                        + current.songs.getMusic_Item_Name() + "" + current.songs.getGenre() + " "
                        + current.songs.getYear_of_Release() + " " + current.songs.getNumber_of_Songs() + " "
                        + current.songs.getTotal_Playing_Time());
                current = current.next;
            }
        }
    }
    public void most_Recently_Added_List() {
        Node previous, current;
        previous = null;
        if (FRONT == null) {
            System.out.println("Queue underflow");
        } else {
            current = REAR;
            while (current != null) {
                System.out.println(current.songs.getRelease_Type() + " " + current.songs.getArtist() + " "
                        + current.songs.getMusic_Item_Name() + "" + current.songs.getGenre() + " "
                        + current.songs.getYear_of_Release() + " " + current.songs.getNumber_of_Songs() + " "
                        + current.songs.getTotal_Playing_Time());
                current = current.next;
            }
        }
    }
}

