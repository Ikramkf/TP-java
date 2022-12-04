public class Vendeur extends Commercial{
    public Vendeur(String nom , String prenom , int age , String daten , double CA){
        super(nom, prenom, age, daten, CA);
    }


    public double calculerSalaire() {
        return super.calculerSalaire()+400;
    }
    public String getNom(){
        return " le Vendeur "+ super.nom + super.prenom +" gagne " + calculerSalaire() + " euros ";
    }
}
