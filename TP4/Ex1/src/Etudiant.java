public class Etudiant extends Personne {
    private String CNE ;
    public Etudiant(String nom , String prenom , String CNE ){
        super(nom, prenom);
        this.CNE=CNE;

    }
    public String getCNE(String CNE){
        return this.CNE=CNE;
    }
    public void setCNE() {
        CNE = CNE;
    }
    public String toString(){
        return "\t Je suis l'etudiant "+super.prenom.toUpperCase()+super.nom.substring(0,1).toUpperCase()
                +super.nom.substring(1).toLowerCase();
    }

}
