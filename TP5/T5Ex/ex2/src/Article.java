public class Article implements Exportable {
    private static int count ;
    private int code ;
    protected String nom ;
    protected Double prixHT ;

    public Article(String nom , Double prixHT){
        code=count++;
        this.nom=nom;
        this.prixHT=prixHT;
    }
    public int getCode(){
        return this.code;
    }
    public String getNom(){
        return this.nom;
    }
    public double prixTransport(){
        return prixHT*0.05;
    }
    public String toString(){
        return "\t l'article de code " + code+ " son nom est : " + nom+ " "+"son prix hors taxe est  : "+prixHT
                + " "+ "son prix de transport est  " +prixTransport();
    }

    public double droitDouans() {
        return 20*prixHT;
    }


    public String paysDestination() {
        return "France" ;
    }
}
