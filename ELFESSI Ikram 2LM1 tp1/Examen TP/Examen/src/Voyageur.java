public  abstract class Voyageur {
    protected String nom ;
    protected String prenom ;
    protected String mail;
    protected double prixBillet;

    public Voyageur(String nom , String prenom , String mail , double prixBillet){
        this.nom=nom ;
        this.prenom=prenom;
        this.mail=mail;
        this.prixBillet=prixBillet;

    }

    public abstract double calculerPrixBillet();

    public String toString() {
        return "\t Le voyageur : "+prenom.toUpperCase()+" "+
                nom.substring(0,1).toUpperCase()+nom.substring(1).toLowerCase();

    }
}
