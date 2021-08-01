import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
      Analyzer analyzer = new Analyzer();
      analyzer.readMusicCatalog(".//data//music-catalog.csv");
      analyzer.list.sortListArtistAlphabatical();
      analyzer.list.showMusicCatalog(Direction.FORWARD);
      System.out.println();
    System.out.println("Enter your choice Display by:\n1.Artist\n2.Genre\n3.By Album Name or Song Name");
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    Scanner sc = new Scanner(System.in);
    switch(choice){
        case 1: {
            System.out.println("Enter Artist name: ");
            String artistName = sc.nextLine();
            analyzer.list.searchArtist(artistName);
            System.out.println();
        }break;
        case 2: {
            System.out.println("Enter Genre: ");
            String genre = sc.nextLine();
            analyzer.list.searchGenre(genre);
            System.out.println();
        }break;
        case 3: {
            System.out.println("Enter Album name or Music name: ");
            String albumMusicName = sc.nextLine();
            analyzer.list.searchAlbumMusicName(albumMusicName);
            System.out.println();
        }break;
        default: System.out.println("Invalid Choice!"); 
        }
    }
}

