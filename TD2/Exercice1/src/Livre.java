public class Livre extends Document{
    protected String auteur ;
    protected int nbpages;
    public Livre(String Titre, String auteur , int nbpages){
        super(Titre);
        this.auteur=auteur;
        this.nbpages=nbpages;
    }

    @Override
    public String toString() {
        return " \t c est un Livre de l auteur " + auteur+ " son Titre  est "+ super.getTitre()+" son numero : " + getNum_en()+" nb pages : "+nbpages;
    }
}
