public class TechnicienArisque extends Technicien implements Arisque{
    public TechnicienArisque(String nom , String prenom , int age , String daten , int nbnuit){
        super(nom,prenom,age,daten,nbnuit);
    }


    public double calculerSalaire() {
        return super.calculerSalaire()+prime;
    }
    public String getNom() {
        return " le technicien a risque  "+ super.nom + super.prenom + " gagne "+calculerSalaire() + "  euros .";
    }
}
