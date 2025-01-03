package collection.streams.dominio;

public class LightNovel implements Comparable<LightNovel>{
    private String title;
    private double prince;

    public LightNovel(String title, double prince) {
        this.title = title;
        this.prince = prince;
    }

    public String getTitle() {
        return title;
    }

    public double getPrince() {
        return prince;
    }

    @Override
    public String toString() {
        return "{" +
                "title : '" + title + '\'' +
                ", prince : " + prince +
                '}';
    }

    @Override
    public int compareTo(LightNovel o) {
        return this.title.compareTo(o.title);
    }
}
