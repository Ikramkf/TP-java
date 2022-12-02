public class Developpeur extends Personne{
    private String specialité ;
    public Developpeur(String nom , String prenom , String mail , String telephone, double salaire , String specialité){
        super(nom, prenom, mail, telephone, salaire);
        this.specialité=specialité;
    }


    public double calculSalaire() {
        return super.salaire*120/100;
    }

    public String getSpecialité() {
        return specialité;
    }
    public void setSpecialité(String specialité){
        this.specialité=specialité;

    }
    public String toString() {
        return "\t le salaire du developpeur " + super.prenom.toUpperCase()+ " "+super.nom.substring(0,1).toUpperCase()
                +super.nom.substring(1).toLowerCase()+" est "+ calculSalaire()
                + "  sa specialité est : " + specialité;
    }
}
