public class Laboratoire {
    String nomLaboratoire;
    String specialité ;
    int NbBureaux ;
    int NB_MAX_Bureaux ;
    Bureau[] tabBureaux;

    public Laboratoire(String nom , String specialité ){
        this.nomLaboratoire=nomLaboratoire;
        this.specialité=specialité;
        tabBureaux = new Bureau[NB_MAX_Bureaux];

    }
    public Boolean ajouterBureau(Bureau bureau){
        if(NbBureaux<NB_MAX_Bureaux){
            tabBureaux[NbBureaux]=bureau;
            NbBureaux++;
            return true ;
        }else
            return false;
    }

    public void affiche(){
        for(int i=0 ; i<NbBureaux ; i++){
            System.out.println(tabBureaux[i]);
        }
    }
    public int nbrChercheurTotal(){
        int nbrChercheurTotal=0;
        for (int i=0; i<NbBureaux; i++)
            nbrChercheurTotal+=tabBureaux[i].getNbChercheurs();
        return nbrChercheurTotal;
}
}
