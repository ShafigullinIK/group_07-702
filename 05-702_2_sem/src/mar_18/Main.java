package mar_18;

import mar_18.Artist.Country;
import mar_18.Artist.Singer;
import mar_18.Artist.Type;

public class Main {
    public static void main(String[] args) {
        Singer LittleBig =
                new Singer(Type.BAND,
                        "Little Big",
                        4,
                        Country.RUSSIA);
        LittleBig.addGenre(Genre.POP);
        LittleBig.addGenre(Genre.SKA);
        System.out.println(LittleBig);

        Track uno =
                new Track(
                        "Uno",
                        LittleBig,
                        160,
                        Genre.POP
                        );
        System.out.println(uno);
    }
}
