public abstract class Etudiant {
    private String nom;
    private String Adresse;
    private int numero;
    public Etudiant(String nom , String Adresse, int numero){
        this.nom=nom;
        this.Adresse=Adresse;
        this.numero=numero;

    }
    public String getNom(){
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        Adresse = Adresse;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void afficher(){
        System.out.println("Nom :  " + nom +"\n" + "Adresse : "+Adresse+"\n"+ " Numero : "+numero+"\n");

    }
    public abstract void afficherProfil();
    public void afficher(boolean compact){
        if(compact==false){
            this.afficher();
        }else {
            System.out.println("["+nom+","+Adresse+","+numero+"]");
        }
    }

}
