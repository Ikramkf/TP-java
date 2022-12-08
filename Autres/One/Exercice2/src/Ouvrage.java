public class Ouvrage {
    private String date_emp;
    private int ref ;
    private boolean etat ;
    private int nombre_Ouv=0;
    private static int count ;
    public Ouvrage(String date_emp, boolean etat){
        nombre_Ouv=++count;
        this.date_emp = this.date_emp;
        ref=ref;
        this.etat = this.etat;
    }

    public String getDate_emp() {
        return date_emp;
    }

    public void setDate_emp(String date_emp) {
        this.date_emp = date_emp;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public int getNombre_Ouv() {
        return nombre_Ouv;
    }

    public void setNombre_Ouv(int nombre_Ouv) {
        this.nombre_Ouv = nombre_Ouv;
    }

    public String afficher() {
        return "Ouvrage{" +
                "date_emp='" + date_emp + '\'' +
                ", ref=" + ref +
                ", etat=" + etat +
                ", nombre_Ouv=" + nombre_Ouv +
                '}';
    }

}
