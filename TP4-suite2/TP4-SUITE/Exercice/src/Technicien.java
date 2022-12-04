public class Technicien extends Employe{
    protected int nbnuit;
    public Technicien(String nom , String prenom , int age , String daten , int nbnuit){
        super(nom,prenom,age,daten);
        this.nbnuit=nbnuit;

    }

    public double calculerSalaire() {
        return nbnuit*5;
    }


    public String getNom() {
        return " le technicien "+ super.nom + super.prenom + " gagne "+calculerSalaire() + "  euros .";
    }
}
