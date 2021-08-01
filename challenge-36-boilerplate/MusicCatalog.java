public class MusicCatalog {
    Node START = null;
    Node TAIL = null;
    Direction direction;
    public MusicCatalog() {
        START = null;
        TAIL = null;
    }
    public void insert(MusicItem item){
        Node newNode = new Node(item);
        if(START==null){
            START = newNode;
            TAIL = newNode;
            START.prev = null;
            TAIL.next = null;
        } else {
            TAIL.next = newNode;
            newNode.prev = TAIL;
            TAIL = newNode;
            TAIL.next = null;
        }
    }
    public void sortListArtistAlphabatical(){
        Node current, index;
        MusicItem temp;
        if(START==null){
            return;
        } else {
            for(current = START; current!=null; current=current.next){
                for(index=current.next; index!=null; index=index.next){
                    if(current.musicList.getArtistName().compareToIgnoreCase(index.musicList.getArtistName())>0){
                        temp = current.musicList;
                        current.musicList = index.musicList;
                        index.musicList = temp;
                    }
                }
            }
        }
    }
    public void sortListYearReleaseAscending(){
        Node current, index;
        MusicItem temp;
        if(START==null){
            return;
        } else {
            for(current = START; current!=null; current=current.next){
                for(index=current.next; index!=null; index=index.next){
                    if(current.musicList.getYearRelease() > index.musicList.getYearRelease()){
                        temp = current.musicList;
                        current.musicList = index.musicList;
                        index.musicList = temp;
                    }
                }
            }
        }
    }
    public void showMusicCatalog(Direction direction){
        if(direction==Direction.FORWARD){
            if(START==null){
                 return;
            } else {
                Node temp = START;
                while(temp!=null){
                    temp.musicList.showDetails();
                    temp = temp.next;
                }
            }
        } else {
            if(TAIL==null){
                return;
            } else {
                Node temp = TAIL;
                while(temp!=null){
                    temp.musicList.showDetails();
                    temp = temp.prev;
                }
            }
        }
    }
    public void searchArtist(String artistName){
        Node current;
        if(START==null){
            System.out.println("The list is empty");
        }else{
            for(current=START; current!=null; current=current.next){
                if(artistName.equalsIgnoreCase(current.musicList.getArtistName())){
                    current.musicList.showDetails();
                }
            }
        }
    }
    public void searchGenre(String genre){
        Node current;
        if(START==null){
            System.out.println("The list is empty");
        }else{
            for(current=START; current!=null; current=current.next){
                if(genre.equalsIgnoreCase(current.musicList.getGenre())){
                    current.musicList.showDetails();
                }
            }
        }
    }
    public void searchAlbumMusicName(String album){
        Node current;
        if(START==null){
            System.out.println("The list is empty");
        }else{
            for(current=START; current!=null; current=current.next){
                if(album.equalsIgnoreCase(current.musicList.getMusicTypeName())){
                    current.musicList.showDetails();
                }
            }
        }
    }
}
