public class Manutentionnaire extends Employe{

    protected int nbh;
    public Manutentionnaire(String nom , String prenom , int age , String daten , int nbh){
        super(nom,prenom,age,daten);
        this.nbh=nbh;

    }

    public double calculerSalaire() {
        return nbh*65;
    }


    public String getNom() {
        return " le Manutentionnaire "+ super.nom + super.prenom + " gagne "+calculerSalaire() + "  euros .";
    }
}
