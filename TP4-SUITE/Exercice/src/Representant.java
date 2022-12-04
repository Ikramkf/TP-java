public class Representant extends Commercial{
    public Representant(String nom , String prenom , int age , String daten , double CA){
        super(nom, prenom, age, daten, CA);
    }


    public double calculerSalaire() {
        return super.calculerSalaire()+800;
    }
    public String getNom(){
        return " le Representant  "+ super.nom + super.prenom +" gagne " + calculerSalaire() + " euros ";
    }
}

