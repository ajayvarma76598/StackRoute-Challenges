public class MusicItem {
    private String releaseType;
    private String artistName;
    private String musicTypeName;
    private String genre;
    private int yearRelease;
    private int numberSongs;
    private String totalPlayingTime;
    public MusicItem() {
    }
    public MusicItem(String releaseType, String artistName, String musicTypeName, String genre, int yearRelease,
            int numberSongs, String totalPlayingTime) {
        this.releaseType = releaseType;
        this.artistName = artistName;
        this.musicTypeName = musicTypeName;
        this.genre = genre;
        this.yearRelease = yearRelease;
        this.numberSongs = numberSongs;
        this.totalPlayingTime = totalPlayingTime;
    }
    public String getReleaseType() {
        return releaseType;
    }
    public void setReleaseType(String releaseType) {
        this.releaseType = releaseType;
    }
    public String getArtistName() {
        return artistName;
    }
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    public String getMusicTypeName() {
        return musicTypeName;
    }
    public void setMusicTypeName(String musicTypeName) {
        this.musicTypeName = musicTypeName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getYearRelease() {
        return yearRelease;
    }
    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
    public int getNumberSongs() {
        return numberSongs;
    }
    public void setNumberSongs(int numberSongs) {
        this.numberSongs = numberSongs;
    }
    public String getTotalPlayingTime() {
        return totalPlayingTime;
    }
    public void setTotalPlayingTime(String totalPlayingTime) {
        this.totalPlayingTime = totalPlayingTime;
    }
    public void showDetails(){
        System.out.println(releaseType+", "+artistName+", "+musicTypeName+", "+genre+", "+yearRelease+", "+numberSongs+", "+totalPlayingTime);
    }
  }
  
