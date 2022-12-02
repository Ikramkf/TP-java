public class Personne {
    protected static int count;
    protected int id ;
    protected String nom ;
    protected String prenom ;

    public Personne( String nom , String prenom){
        id=++count;
        this.nom=nom ;
        this.prenom =prenom;

    }
    public String toString(){
        return "\t "+ id +" Je suis  : "+ nom +prenom ;
    }
}
