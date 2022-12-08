public class Voiture extends Vehicule{
    protected int nbportes ;
    protected double prixHT;
    protected double TVA ;
    public Voiture(String type , int nbportes , double prixHT , double TVA ){
        super(type);
        this.nbportes=nbportes;
        this.prixHT=prixHT;
        this.TVA=TVA;
    }
    public double calculerTTC ( double prixHT , double TVA){
        return (prixHT * (1+TVA));
    }


    public String toString() {
        return "C est une Voiture de type "+super.getType()+" nb de portes : "+nbportes+"\n"+ "  son prix est "+calculerTTC(prixHT,TVA);
    }
}
