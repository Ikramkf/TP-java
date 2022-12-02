package EX3;

public class Filiere {
    private int id;
    private String code;
    private String libelle;
    private int count;

    public Filiere(String code, String libelle){
        this.id=count++;
        this.code=code;
        this.libelle=libelle;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCode(){
        return code;
    }
    public String getLibelle(){
        return libelle;
    }
    public void setLibelle(String libelle){
        this.libelle=libelle;
    }
    public String toString(){
        return "\tFiliere : "+this.libelle;
    }
}
