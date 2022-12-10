public class Aérien extends Voyageur{
    protected int numVol;
    public Aérien(String nom , String prenom , String mail , double prixBillet , int numVol){
        super(nom,prenom,mail,prixBillet);
        this.numVol=numVol;
    }

    public double calculerPrixBillet() {
        return super.prixBillet * 0.8;
    }

    public String toString() {
        return "\t Le voyageur Aérien : "+prenom.toUpperCase()+" "+
                nom.substring(0,1).toUpperCase()+nom.substring(1).toLowerCase()+ " va paye : " +
                calculerPrixBillet()+ " , son numéro de vol  est : " + numVol;
    }
}
