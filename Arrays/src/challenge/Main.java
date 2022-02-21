package challenge;

import java.util.*;

public class Main {
    private static ArrayList<Album> albumsList = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.2);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealaer", 3.21);
        album.addSong("You can't do it right", 3.21);
        album.addSong("High ball shooter", 3.21);
        album.addSong("The gypsy", 3.21);
        album.addSong("Soldier of fortune", 3.21);
        albumsList.add(album);
        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Snowballed", 3.33);
        album.addSong("Evil walks", 4.51);
        album.addSong("C.O.D", 3.45);
        album.addSong("For those about to rock", 5.25);
        album.addSong("For those about to rock", 5.32);
        album.addSong("For those about to rock", 5.12);
        albumsList.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albumsList.get(0).addToPlaylist("You can't do it right", playList);
        albumsList.get(0).addToPlaylist("Holy man", playList);
        albumsList.get(0).addToPlaylist("Speed king", playList); // Does not exist
        albumsList.get(0).addToPlaylist(9, playList); // Does not exist
        albumsList.get(0).addToPlaylist(8, playList); // Does not exist
        albumsList.get(0).addToPlaylist(3, playList); // Does not exist
        albumsList.get(0).addToPlaylist(2, playList); // Does not exist
        albumsList.get(0).addToPlaylist(24, playList); // Does not exist
        play(playList);

    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playList");
            return;
        }
        System.out.println("Now playing " + listIterator.next().toString());
        printMenu();
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playList");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the end of the playList");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
//                    printPlayList(playlist);
                case 5:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
            "1 - to play next song\n" +
            "2 - to play previous song\n" +
            "3 - replay the current song\n" +
            "4 - list songs in the playlist\n" +
            "5 - print available actions.");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }

}
