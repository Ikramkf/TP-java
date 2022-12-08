public class Main {
    public static void main(String[] args) {
        Livre l1 = new Livre("12/12/2012", true, "Victor Hugo", "Causette", "ed1", 45);
        Livre l2 = new Livre("10/10/2012", false, "Victor", "Dance", "ed3", 50);
        Livre l3 = new Livre("09/04/2012", true, " Hugo", "LOVE", "ed2", 80);

        Bibliotheque Bib = new Bibliotheque(5);
        Bib.ajout(l1,0);
        Bib.ajout(l2,1);
        Bib.ajout(l3,2);
        Bib.afficher();

        Bib.supprimer(2);
     
        Bib.emprunter("LUNE","19/09/2015");
        Bib.emprunter("Caussette","20/10/2018");

        Bib.Retour("Causette");

        Bib.afficher();


    }
}