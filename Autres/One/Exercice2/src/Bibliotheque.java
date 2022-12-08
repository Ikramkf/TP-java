public class Bibliotheque {
    int taille ;

    private Livre b[] ;
    public Bibliotheque(int taille){
        b = new Livre[taille];
    }
    public void ajout ( Livre l , int nblivres  ){
        if (nblivres+1<taille){
            b[nblivres+1]=l;
        }
    }
    public void supprimer(int r){
        for ( int i=0 ;i<taille ;i++)
            if(b[i].getRef()==r){
                b[i]=b[i+1];
                System.out.println("suppression effectue");

            }else{
                System.out.println("livre non disponible ");
            }
    }
    public void afficher(){
        for(int i=0 ; i<taille;i++){
                b[i].afficher();
            }
        }


    public void emprunter(String titre, String date){
        for(int i =0 ; i<taille ; i++){
            if(b[i].getTitre()==titre){
                if(b[i].isEtat()==false){
                    b[i].setEtat(true);
                    b[i].setDate_emp(date);
                    System.out.println("Le nouvel etat du livre est : "+b[i]);
                }else{
                    System.out.println("livre est deja emprunté ");
                }
            }else{
                System.out.println("livre non dispo ");
            }
        }
    }
    public void Retour(String titre){
        for(int i =0 ; i<taille ; i++){
            if(b[i].getTitre()==titre){
                b[i].setEtat(false);
                b[i].setDate_emp("");
            }else{
                System.out.println("Livre introuvable");
            }
    }


} }
