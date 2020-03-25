package mar_18;

import mar_18.Artist.Country;
import mar_18.Artist.Singer;
import mar_18.Artist.Type;

public class Main {
    public static void main(String[] args) {
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
        Track bailando = new Track(
                "Байландо",
                iglesias,
                190,
                Genre.POP
        );

        Album a2020 = new Album(
                "Странный",
                2020
                );

        a2020.addTrack(uno);
        a2020.addTrack(bailando);
        a2020.addTrack(skibidi);

        System.out.println(a2020);
    }
}
