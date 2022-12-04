public class Personnel {
    int l ;
    double total ;
    double moy ;
    int nbemploye ;
    Employe [] employe ;
    public Personnel(){
        l++;
        employe = new Employe[50];
        nbemploye=0;
    }



    public void ajouterEmploye(Employe E){
        nbemploye++;
        if(nbemploye<l){
            employe[l-1]=E;
        }

    }

    public void calculerSalaires(){
        for (int i=0 ; i<l ; i++){
            System.out.println("le salaire de l'employe "+ employe.get(i).getNom() + " est  " + employe[i].calculerSalaire());
        }

    }
    public void afficherSalaires() {
        for (int i = 0; i < arrayListEmployes.size(); i++) {
            System.out.println(arrayListEmployes.get(i).getNom() + arrayListEmployes.get(i).toString());
        }
    }
    public double salaireMoyen(){
        for(int i=0 ; i<l ; i++){
            total=(total+employe[i].calculerSalaire());
            moy=total/l;
        }
        return moy ;

    }
}
