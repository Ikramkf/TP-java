public class Personnel {
    double moy;
    double total ;
    int nbemploye ;
    private Employe[] employe ;
    private final static int max=200;
    public Personnel(){
        employe = new Employe[max];
        nbemploye=0;
    }



    public void ajouterEmploye(Employe E){

        if(nbemploye<max){
            employe[nbemploye]=E;

        nbemploye++;
        }
    }

    public void calculerSalaires(){
        for (int i=0 ; i<nbemploye ; i++){
            System.out.println("le salaire de l'employe "+ employe[i].getNom() + " est  " + employe[i].calculerSalaire());
        }

    }
    public double salaireMoyen(){
        for(int i=0 ; i<nbemploye; i++){
            total=(total+employe[i].calculerSalaire());
            moy=total/employe.length;
        }
        return moy ;

    }
}
