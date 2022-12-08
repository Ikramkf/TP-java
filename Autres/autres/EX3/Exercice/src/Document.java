public class Document {
    protected int numEnreg;
    protected String titre;

    public Document(int x, String y) {
        this.numEnreg = x;
        this.titre = y;
    }

    public int getNumEnreg() {
        return this.numEnreg;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setNumEnreg(int numEnreg) {
        this.numEnreg = numEnreg;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String toString() {
        return this.numEnreg + " : " + this.titre;
    }
}