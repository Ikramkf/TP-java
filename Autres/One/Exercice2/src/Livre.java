public class Livre extends Ouvrage{
    private String auteur ;
    private String titre;
    private String editeur ;
    private int nb_pages;
    public Livre(String date_emp , boolean etat , String auteur , String titre , String editeur , int nb_pages){
        super(date_emp,etat);
        this.auteur=auteur;
        this.titre=titre;
        this.editeur=editeur;
        this.nb_pages=nb_pages;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public int getNb_pages() {
        return nb_pages;
    }

    public void setNb_pages(int nb_pages) {
        this.nb_pages = nb_pages;
    }

    public String afficher() {
        return " c est un livre de date "+super.getDate_emp()+ "\n"+" son etat:  "+
                super.isEtat()+"\n"+"Titre :  " +titre +"\n"+
                "Editeur : "+editeur+"\n"+
                "Nb pages : " + nb_pages;
    }
}
