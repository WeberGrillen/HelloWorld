package Spotify;
import java.util.ArrayList;
import java.util.Scanner;
public class SpotifyApp {
    private static Scanner scanner = new Scanner(System.in);
    private static SongLibrary playlist = new SongLibrary();

    public static void main(String [] args) {
        boolean running = true;
        System.out.println("Welcome to homemade Spotify! Choose an option");
        while (running) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    addNewSong();
                    break;
                case 2:
                    removeSong();
                    break;
                case 3:
                    playlist.showAllSongs();
                    break;
                case 4:
                    searchForSong();
                    break;
                case 5:
                    editSong();
                    break;
                case 6:
                    System.out.println("Program is closing...");
                    running = false;
                    break;
                default :
                    System.out.println("Incorrect answer... Try again");
            }
        }


    }

    public static void showMenu() {
        System.out.println("Press 1. Add a song");
        System.out.println("Press 2. remove a song");
        System.out.println("Press 3. Show all playlist songs");
        System.out.println("Press 4. Search for a song");
        System.out.println("Press 5. Edit a song");
        System.out.println("Press 6. Close program");
    }

    public static void addNewSong() {
        System.out.println("Enter song titel:");
        String titel = scanner.nextLine();
        System.out.println("Enter artist name:");
        String artist = scanner.nextLine();
        System.out.println("Enter genre:");
        String genre = scanner.nextLine();

        Song newSong = new Song(titel,artist,genre);
        playlist.addSong(newSong);
    }

    public static void removeSong() {
        System.out.println("Enter song name you want to remove:");
        String titel = scanner.nextLine();
        playlist.removeSong(titel);
    }

    public static void searchForSong() {
        System.out.println("Enter song titel you want to find");
        String titel = scanner.nextLine();
        Song findSong = playlist.findSong(titel);

        if (findSong != null) {
            System.out.println("The song was found:" + findSong);
        } else {
            System.out.println("The song was not found in your playlist");
        }
    }
    public static void editSong() {
        System.out.println("Enter the song titel you want to edit");
        String oldTitel = scanner.nextLine();
        Song songToEdit = playlist.findSong(oldTitel);

        if (songToEdit != null) {
            System.out.println("Enter new titel:");
            String newTitel = scanner.nextLine();
            songToEdit.setTitel(newTitel);
            System.out.println("The titel has been update to: " + newTitel);
        } else {
            System.out.println("The song was not found");
        }
    }

}
