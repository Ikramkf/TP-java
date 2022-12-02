public  abstract class Personne {
    protected static int count ;
    protected int id ;
    protected String nom ;
    protected String prenom ;
    protected String mail ;
    protected String telephone ;
    protected double salaire ;

    public Personne(String nom , String prenom , String mail , String telephone , double salaire){
        id=++count;
        this.nom=nom;
        this.prenom=prenom;
        this.mail=mail;
        this.telephone=telephone;
        this.salaire=salaire;
    }
    public abstract double calculSalaire();

}
