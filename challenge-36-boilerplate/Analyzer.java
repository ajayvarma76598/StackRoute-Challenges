import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Analyzer {
    MusicItem musics;
    MusicCatalog list = new MusicCatalog();
    public boolean readFile(String fileName){
        String line;
        musics = new MusicItem();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            while((line = bufferedReader.readLine()) != null){
                musics = getLine(line);
                list.insert(musics);
            }
        } catch(FileNotFoundException e){
            e.getStackTrace();
        } catch(IOException e){
            e.getStackTrace();
        }
        return true;
    }
    public MusicItem getLine(String line){
        MusicItem detailMusic = new MusicItem();
        String[] columns = line.split(", ");
        detailMusic.setReleaseType(columns[0]);
        detailMusic.setArtistName(columns[1]);
        detailMusic.setMusicTypeName(columns[2]);
        detailMusic.setGenre(columns[3]);
        detailMusic.setTotalPlayingTime(columns[6]);
        try{
            detailMusic.setYearRelease(Integer.parseInt(columns[4]));
            detailMusic.setNumberSongs(Integer.parseInt(columns[5]));
        } catch(NumberFormatException e){
        }
        return detailMusic;
    }
    public boolean readMusicCatalog(String filename){
        if(readFile(filename)){
            return true;
        }
        return false;
    }
}

