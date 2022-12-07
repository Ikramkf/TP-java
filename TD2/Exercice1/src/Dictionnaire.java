public class Dictionnaire extends Document{
    protected String lang;
    protected int nbTomes;
    public Dictionnaire(String Titre , String lang , int nbTomes){
        super(Titre);
        this.lang=lang;
        this.nbTomes=nbTomes;
    }

    @Override
    public String toString() {
        return "\t C est un dictionnaire de tire "+super.getTitre()+ "son num : "+ super.getNum_en()+" de langue : "+lang+"nombre det tomes est : "+nbTomes;
    }
}