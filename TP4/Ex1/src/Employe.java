public class Employe extends Personne{
    protected double salaire ;
    public Employe(String nom , String prenom , double salaire){
        super(nom, prenom);
        this.salaire=salaire;

    }
    public String toString(){
        return "\t Je suis l'employe "+super.prenom.toUpperCase()+super.nom.substring(0,1).toUpperCase()
                +super.nom.substring(1).toLowerCase()+" Mon salaire est "+salaire;
    }
}
