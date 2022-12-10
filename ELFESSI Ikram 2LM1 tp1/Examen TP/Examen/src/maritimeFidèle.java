public class maritimeFidèle extends Maritime implements estFidèle{
    public maritimeFidèle(String nom , String prenom , String mail , double prixBillet , int numEmbarquement){
        super(nom, prenom, mail, prixBillet, numEmbarquement);
    }


    public double calculerPrixBillet() {
        return super.calculerPrixBillet() -150;
    }

    public String toString() {
        return "\t Le voyageur Maritime  fidèle  : "+prenom.toUpperCase()+" "+
                nom.substring(0,1).toUpperCase()+nom.substring(1).toLowerCase()+ " va paye seulement  : " +
                calculerPrixBillet()+ " , son numéro d'embarquement   est : " + numEmbarquement;
    }
}
