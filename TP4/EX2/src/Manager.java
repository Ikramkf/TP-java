
public class Manager extends Personne{
    private String service ;
    public Manager(String nom , String prenom , String mail , String telephone, double salaire , String service){
        super(nom, prenom, mail, telephone, salaire);
        this.service=service;

    }
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double calculSalaire() {
        return super.salaire*135/100;
    }

    public String toString() {
        return "\t le salaire du developpeur " + super.prenom.toUpperCase()+" " +super.nom.substring(0,1).toUpperCase()
                +super.nom.substring(1).toLowerCase()+" est "+ calculSalaire()
                + "  son service  est : " + service ;
    }
}
