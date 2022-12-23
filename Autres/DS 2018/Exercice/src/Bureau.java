public class Bureau {
    int numBureau ;
    int numEtage;
    int NbChercheurs ;
    int NB_MAX_CHERCHEURS;
    Chercheur[]tabChercheurs ;

    public Bureau(int numBureau , int numEtage){
        this.numBureau=numBureau;
        this.numEtage=numEtage;
        tabChercheurs = new Chercheur[NB_MAX_CHERCHEURS];

    }
    public void affiche(){
        for(int i=0 ; i<NbChercheurs ; i++){
            System.out.println("le chercheur num "+i+ " est "+tabChercheurs[i]);

        }
    }
    public boolean ajouterChercheur(Chercheur chercheur){
        if(this.NbChercheurs<NB_MAX_CHERCHEURS) {
            tabChercheurs[NbChercheurs] = chercheur;
            NbChercheurs++;
            return true;
        }else
            return false ;
    }
    public int trouverChercheur(Chercheur chercheur){
        for(int i=0 ; i<NbChercheurs ; i++){
            if(chercheur.equals(tabChercheurs[i]))
                return i ;

        }
        return -1;
    }
    public int getNbChercheurs(){
        return NbChercheurs;
    }
    public void Supprimer(Chercheur c){
        int p ;
            p=trouverChercheur(c);
            for (int i=0 ; i<NbChercheurs ; i++){

            tabChercheurs[p]=tabChercheurs[p+1];
        }NbChercheurs--;
    }
}
