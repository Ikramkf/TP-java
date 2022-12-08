public class Vehicule {
    private String type ;
    public Vehicule(String type){
        this.type=type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String toString() {
        return " c est une vehicule de type " + type;
    }
}
