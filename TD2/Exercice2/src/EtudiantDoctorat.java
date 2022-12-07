public class EtudiantDoctorat extends Etudiant{
    private String d_recherche;
    public EtudiantDoctorat(String nom , String Adresse , int numero , String d_recherche){
        super(nom, Adresse, numero);
        this.d_recherche=d_recherche;

    }

    public String getD_recherche() {
        return d_recherche;
    }

    public void setD_recherche(String d_recherche) {
        this.d_recherche = d_recherche;
    }


    public void afficher() {
        super.afficher();

    }
    public void afficherProfil(){
        System.out.println("Etudiants en Doctorat en " + d_recherche);
    }
}
