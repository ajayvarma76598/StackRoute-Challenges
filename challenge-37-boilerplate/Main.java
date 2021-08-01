import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        FileReader fReader = null;
        try {
            fReader = new FileReader("data/music-catalog.csv");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(fReader);
        String line;
        int count = 0;
        String newLine = "";
        while ((line = reader.readLine()) != null) {
            count++;
        }
        System.out.println("line" + count);
        Songs[] song = new Songs[count];
        FileReader fReader1 = new FileReader("data/music-catalog.csv");
        BufferedReader reader1 = new BufferedReader(fReader1);
        count = 0;
        int i = 0;
        PlayList playList = new PlayList();
        while ((line = reader1.readLine()) != null) {
            String words[] = line.split(",");
            playList.insert(new Songs(words[0], words[1], words[2], words[3], Integer.parseInt(words[4].trim()),
                    Integer.parseInt(words[5].trim()), words[6].trim()));
            i++;
        }
        playList.traverse();
        int k = 0;
        do {
            System.out.println("1.remove" + " " + "2.add");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    playList.remove();
                    playList.traverse();
                    break;
                case 2:
                    Songs s = new Songs();
                    String release = scanner.next();
                    s.setRelease_Type(release);
                    String artist = scanner.next();
                    s.setArtist(artist);
                    String music = scanner.next();
                    s.setMusic_Item_Name(music);
                    String genre = scanner.next();
                    s.setGenre(genre);
                    int year = scanner.nextInt();
                    s.setYear_of_Release(year);
                    int number_of_Songs = scanner.nextInt();
                    s.setNumber_of_Songs(number_of_Songs);
                    String time = scanner.next();
                    s.getTotal_Playing_Time();
                    playList.insert(new Songs(s.getRelease_Type(), s.getArtist(), s.getMusic_Item_Name(), s.getGenre(),
                            s.getYear_of_Release(), s.getNumber_of_Songs(), s.getTotal_Playing_Time()));
                    playList.traverse();
                default:
                    break;
            }
            System.out.println("Press :1 for exit");
            k = scanner.nextInt();
        } while (k != 1);
        playList.most_Recently_Added_List();
    }
}

