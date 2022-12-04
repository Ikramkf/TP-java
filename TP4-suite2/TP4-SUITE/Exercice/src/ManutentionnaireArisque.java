public class ManutentionnaireArisque extends Manutentionnaire implements Arisque{
    public  ManutentionnaireArisque(String nom , String prenom , int age , String daten , int nbh){
        super(nom,prenom,age,daten,nbh);
    }


    public double calculerSalaire() {
        return super.calculerSalaire()+prime;
    }
    public String getNom() {
        return " le Manutentionnaire a risque  "+ super.nom + super.prenom + " gagne "+calculerSalaire() + "  euros .";
    }
}
