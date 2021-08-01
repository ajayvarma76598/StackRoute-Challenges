public class Songs {
    private String release_Type;
    private String artist;
    private String music_Item_Name;
    private String genre;
    private int year_of_Release;
    private int number_of_Songs;
    private String total_Playing_Time;
    Songs() {
    }
    public Songs(String release_Type, String artist, String music_Item_Name, String genre, int year_of_Release,
                int number_of_Songs, String total_Playing_Time) {
        this.release_Type = release_Type;
        this.artist = artist;
        this.music_Item_Name = music_Item_Name;
        this.genre = genre;
        this.year_of_Release = year_of_Release;
        this.number_of_Songs = number_of_Songs;
        this.total_Playing_Time = total_Playing_Time;
    }
    public String getRelease_Type() {
        return release_Type;
    }
    public void setRelease_Type(String release_Type) {
        this.release_Type = release_Type;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getMusic_Item_Name() {
        return music_Item_Name;
    }
    public void setMusic_Item_Name(String music_Item_Name) {
        this.music_Item_Name = music_Item_Name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getYear_of_Release() {
        return year_of_Release;
    }
    public void setYear_of_Release(int year_of_Release) {
        this.year_of_Release = year_of_Release;
    }
    public int getNumber_of_Songs() {
        return number_of_Songs;
    }
    public void setNumber_of_Songs(int number_of_Songs) {
        this.number_of_Songs = number_of_Songs;
    }
    public String getTotal_Playing_Time() {
        return total_Playing_Time;
    }
    public void setTotal_Playing_Time(String total_Playing_Time) {
        this.total_Playing_Time = total_Playing_Time;
    }
}

