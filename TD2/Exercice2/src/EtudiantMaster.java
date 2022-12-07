public class EtudiantMaster extends Etudiant{
    private String specialité ;
    public EtudiantMaster(String nom , String Adresse, int numero , String specialité){
        super(nom, Adresse, numero);
        this.specialité=specialité;

    }

    public String getSpecialité() {
        return specialité;
    }

    public void setSpecialité(String specialité) {
        this.specialité = specialité;
    }


    public void afficher() {
        super.afficher();

    }
    public void afficherProfil(){
        System.out.println("Etudiants en Master en  :  " + specialité);
    }
}
