package sg.edu.rp.c346.id22027176.l08_ps_songs;

import androidx.annotation.NonNull;

public class Songs {

    private int id;
    private String title;
    private String singers;
    private Integer year;
    private Integer stars;

    public Songs(int id, String title, String singers, Integer year, Integer stars) {
        this.id = id;
        this.title = title;
        this.singers = singers;
        this.year = year;
        this.stars = stars;
    }

    public int getId() { return id; }

    public String getTitle() {
        return title;
    }

    public String getSingers() {
        return singers;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getStars() {
        return stars;
    }

    @NonNull
    @Override
    public String toString() {
        return "ID: " + id + "\n" + "title: " + title + "\n" + "singer: " + singers + "\n" + "year: " + year + "\n" + "ratings: " + stars;
    }

}
