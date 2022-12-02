package EX3;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Etudiant {
    private int id ;
    private String nom ;
    private String prenom ;
    private Date datenaissance;
    private Filiere filiere;
    private static int count;
    public Etudiant (String n , String p ,Date d , Filiere f){
        this.id=++count;
        this.nom=n;
        this.prenom=p;
        this.datenaissance=d;
        this.filiere=f;
    }

    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
    public String getNom(){
        return nom ;
    }
    public void set(String n ){
        nom=n;
    }
    public String getPrenom(){
        return prenom ;
    }
    public void setPrenom (String p){
       prenom=p ;
    }
    public Date getDate(){
        return datenaissance ;
    }
    public void setDate(Date d ){
        datenaissance=d;
    }
    public Filiere getFiliere(){
        return filiere ;
    }
    public void setFiliere(Filiere f){
        filiere=f;
    }
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("aaaa/mm/jj");
        return "Je suis l'etudiant "+this.nom+" "+this.prenom
                +"ma date de naissance est : "
                +sdf.format(this.datenaissance);
    }
}
