package mar_18;

import mar_18.Artist.Country;
import mar_18.Artist.Singer;
import mar_18.Artist.Type;

import java.util.ArrayList;

public class Main {

    static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        createAlbums();
        albums.stream()
                .map(album -> album.getTracks())
                .flatMap(arrayListTracks-> arrayListTracks.stream())
                .forEach(System.out::println);


    }

    public static void createAlbums(){
        Singer littleBig =
                new Singer(Type.BAND,
                        "Little Big",
                        4,
                        Country.RUSSIA);
        littleBig.addGenre(Genre.POP);
        littleBig.addGenre(Genre.SKA);

        Track uno =
                new Track(
                        "Uno",
                        littleBig,
                        160,
                        Genre.POP
                );
        Track skibidi = new Track(
                "Skibidi",
                littleBig,
                200,
                Genre.JAZZ
        );

        Singer iglesias =
                new Singer(Type.SOLO,
                        "Энрике Иглесиас",
                        1,
                        Country.SPAIN);
        iglesias.addGenre(Genre.POP);
        iglesias.addGenre(Genre.ROCK);
        Track bailando = new Track(
                "Байландо",
                iglesias,
                190,
                Genre.POP
        );
        Track elRey = new Track(
                "El Rey",
                iglesias,
                130,
                Genre.ROCK
        );

        Singer eminem = new Singer(
                Type.SOLO,
                "Эминем",
                1,
                Country.USA
        );
        eminem.addGenre(Genre.RAP);
        Track rapGod = new Track(
                "Реп Год",
                eminem,
                210,
                Genre.RAP
        );
        Track stan = new Track(
                "Стэн",
                eminem,
                360,
                Genre.RAP
        );


        Album a2020 = new Album(
                "Странный",
                2020
        );

        a2020.addTrack(uno);
        a2020.addTrack(bailando);
        a2020.addTrack(skibidi);
        a2020.addTrack(rapGod);

        Album a2019 = new Album(
                "Очень странный",
                2019);
        a2019.addTrack(stan);
        a2019.addTrack(skibidi);

        albums.add(a2019);
        albums.add(a2020);
    }
}
