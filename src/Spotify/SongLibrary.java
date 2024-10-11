package Spotify;

import java.util.ArrayList;

public class SongLibrary {

    private ArrayList<Song> songList;

    public SongLibrary() {
        songList = new ArrayList<>();
    }

    // Metode til at tilføje en sang til playlisten
    public void addSong(Song addSong) {
        songList.add(addSong);
        System.out.println(addSong.getTitel() + " is added to your playlist.");
    }

    // Metode til at find en sang baseret på titel
    public Song findSong(String titel) {
        for (Song song : songList) {
            if (song.getTitel().equalsIgnoreCase(titel)) {
                return song;
            } else {
                System.out.println("The song isn't in your playlist");
            }
        }
        return null;
    }

    // Metode til at remove sang
    public void removeSong(String titel) {
        Song songToRemove = findSong(titel);
        if (songToRemove != null) {
            songList.remove(songToRemove);
            System.out.println("The song \"" + titel + "\" er fjernet fra playlisten.");
        } else {
            System.out.println("The song \"" + titel + "\" wasn't found in your playlist.");
        }
    }

    // Metode til at vise alle sange i playlisten
    public void showAllSongs() {
        if (songList.isEmpty()) {
            System.out.println("There is no songs in your playlist.");
            return;
        }
        System.out.println("Songs in the playlist:");
        for (Song song : songList) {
            System.out.println(song);
        }
    }

}
