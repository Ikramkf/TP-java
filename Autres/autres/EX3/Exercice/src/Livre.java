public class Livre extends Document {
    private String auteur;
    private int nbpages;

    public Livre(int x, String y, String z, int t) {
        super(x, y);
        this.auteur = z;
        this.nbpages = t;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public int getNbpages() {
        return this.nbpages;
    }

    public String toString() {
        return super.toString() + ", de " + this.auteur + " (" + this.nbpages + " pages)";
    }
}
