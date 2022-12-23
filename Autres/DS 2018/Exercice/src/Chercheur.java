public class Chercheur {
    String nom ;
    String prenom ;
    int numOrdinateur ;
    public Chercheur(String nom, String prenom , int numOrdinateur){
        this.nom=nom;
        this.prenom=prenom;
        this.numOrdinateur=numOrdinateur;
    }

    public String affiche(){
        return "\t Le chercheur : "+nom + " " + prenom+ " son ordinateur : "+numOrdinateur ;

    }

    public boolean equals(Chercheur c1 , Chercheur c2){
        boolean test = false;
        if(c1.nom.equals(c2.nom)){
            if(c1.prenom.equals(c2.prenom)){
                if(c1.numOrdinateur==(c2.numOrdinateur)){
                    test= true ;
                }
            }
        }else
            test =false ;
        return test;
    }


}
