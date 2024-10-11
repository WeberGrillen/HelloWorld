package Spotify;

public class Song {
    private String titel;
    private String artist;
    private String genre;

    public Song(String titel, String artist, String genre) {
        this.titel = titel;
        this.artist = artist;
        this.genre = genre;
    }

    // Getters
    public String getTitel() {
        return this.titel;
    }
    public String getArtist() {
        return this.artist;
    }
    public String getGenre() {
        return this.genre;
    }

    // Setters
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String toString() {
        return "Song info:\n" + this.titel + "\n" + this.artist + "\n" + this.genre;
    }
}
