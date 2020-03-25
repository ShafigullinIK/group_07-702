package mar_18.Artist;

import mar_18.Genre;

import java.util.HashSet;

public class Singer {
    private Type type;
    private String name;
    private HashSet<Genre> genres;
    private int count;
    private Country country;

    public Singer(Type type, String name, int count, Country country) {
        this.type = type;
        this.name = name;
        this.count = count;
        this.country = country;
        genres = new HashSet<>();
    }

    public void addGenre(Genre g){
        genres.add(g);
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public HashSet<Genre> getGenres() {
        return genres;
    }

    public int getCount() {
        return count;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", genres=" + genres +
                ", count=" + count +
                ", country=" + country+
                '}';
    }
}


