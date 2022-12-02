public class Fragile extends Article {
    private String emballage ;
    public Fragile (String nom , double prixHT ,String emballage ){
        super(nom,prixHT);
        this.emballage=emballage;
    }
    public Fragile( String nom , double prixHT){
        super(nom,prixHT);
    }
    public double prixTransport(){
        return super.prixTransport()*2;
    }



}
