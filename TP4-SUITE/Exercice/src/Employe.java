public  abstract class Employe {
    protected String nom ;
    protected String prenom ;
    protected int age ;
    protected String daten;

    public Employe( String nom , String prenom , int age, String daten){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.daten=daten;
    }
    public abstract double calculerSalaire();
    public String getNom(){
        return "l'employe est : " +nom+prenom;
    }
}
