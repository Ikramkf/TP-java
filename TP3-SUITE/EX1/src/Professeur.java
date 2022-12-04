public class Professeur {
    private static int count ;
    private int id ;
    private String nom ;
    private String prenom ;
    private String tel ;
    private String email ;

    public Professeur(String nom , String prenom , String tel , String email ){
        id=++count;
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.email=email;
    }

}
