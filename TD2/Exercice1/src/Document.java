public class Document {
    private String Titre ;
    private int num_en;
    private static int count=0;

    public Document(String Titre){
        num_en=++count;
        this.Titre=Titre;
    }
    public int getNum_en(){
        return num_en;
    }

    public String getTitre() {
        return Titre;
    }
    public void setTitre(String titre){
        this.Titre=Titre;
    }


    public String toString() {
        return "\t le document du num "+num_en+" son titre est : "+Titre;
    }
}
