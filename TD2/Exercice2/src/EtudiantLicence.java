public class EtudiantLicence extends Etudiant{
    private String parcours;
    public EtudiantLicence(String nom , String Adresse , int numero, String parcours){
        super(nom, Adresse, numero);
        this.parcours=parcours;
    }

    public String getParcours() {
        return parcours;
    }

    public void setParcours(String parcours) {
        this.parcours = parcours;
    }
    public void afficher(){
        super.afficher();

    }
    public void afficherProfil(){
        System.out.println("Etudiants en licence  en "+ parcours);
    }

}
