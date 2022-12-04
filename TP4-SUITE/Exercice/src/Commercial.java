public class Commercial  extends Employe{
    protected double CA ;
    public Commercial(String nom , String prenom , int age , String daten , double CA ){
        super(nom,prenom,age,daten);
        this.CA=CA;
    }
    public double calculerSalaire(){
        return (CA*120)/100;
    }
    public String getNom(){
        return " le commercial "+ super.nom+super.prenom;
    }
}
