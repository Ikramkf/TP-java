public class Maritime extends Voyageur {
    protected int numEmbarquement ;
    public Maritime(String nom , String prenom , String mail, double prixBillet , int numEmbarquement){
        super(nom,prenom,mail,prixBillet);
        this.numEmbarquement=numEmbarquement;
    }


    public double calculerPrixBillet() {
        return super.prixBillet *0.5;
    }


    public String toString() {
        return "\t Le voyageur Maritime : "+prenom.toUpperCase()+" "+
                nom.substring(0,1).toUpperCase()+nom.substring(1).toLowerCase()+ " va paye : " +
                calculerPrixBillet()+ " , son numéro  d'embarquement est : " + numEmbarquement;
    }
}
