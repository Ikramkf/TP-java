public class Professeur extends Employe{
    private String specialité ;
    public Professeur(String nom , String prenom , double salaire , String specialité){
        super(nom, prenom, salaire);
        this.specialité=specialité;
    }
    public String getSpecialité() {
        return specialité;
    }
    public void setSpecialité(String specialité)
    {
        this.specialité=specialité;
    }
    public String toString() {
        return "\t Je suis le professeur  "+super.prenom.toUpperCase()+super.nom.substring(0,1).toUpperCase()
                +super.nom.substring(1).toLowerCase()+" Mon salaire est "+salaire
                + "  ma specialité est "+specialité;
    }
}
