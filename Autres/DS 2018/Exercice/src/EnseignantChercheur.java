public class EnseignantChercheur extends Chercheur{
    int nbMatieres ;
    public EnseignantChercheur(String nom , String prenom , int numOrdinateur){
        super(nom, prenom, numOrdinateur);
    }
    public String affiche(){
         return super.affiche()+" ses matieres : "+nbMatieres ;
    }
}
