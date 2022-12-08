public class Dictionnaire extends Document {
    private String langue;
    private int articles;

    public Dictionnaire(int x, String y, String z, int t) {
        super(x, y);
        this.langue = z;
        this.articles = t;
    }

    public int getArticles() {
        return this.articles;
    }

    public String getLangue() {
        return this.langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }

    public String toString() {
        return super.toString() + ", dictionnaire " + this.langue + "(" + this.articles + " articles)";
    }
}