public class aérienFidèle extends Aérien implements estFidèle{

    public aérienFidèle(String nom , String prenom , String mail , double prixBillet  , int numVol){
        super(nom,prenom,mail,prixBillet,numVol);
    }


    public double calculerPrixBillet() {
        return super.calculerPrixBillet() -150 ;
    }


    public String toString() {
        return "\t Le voyageur Aérien fidèle  : "+prenom.toUpperCase()+" "+
                nom.substring(0,1).toUpperCase()+nom.substring(1).toLowerCase()+ " va paye seulement  : " +
                calculerPrixBillet()+ " , son numéro de vol  est : " + numVol;
    }
}
