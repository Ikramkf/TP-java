public class Main {
    public static void main(String[] args) {
        Chercheur c1 = new Chercheur("Ahmed","bensalah",5);
        Chercheur c2= new Chercheur("Olfa","kouka",3);
        Chercheur c3 = new Chercheur("Karim","abelbeki",4);
        System.out.println(c1.affiche());
        System.out.println(c2.affiche());
        System.out.println(c3.affiche());
        EnseignantChercheur e1 = new EnseignantChercheur("Mohamed","Lamine",10);
        System.out.println(e1.affiche());

        Bureau b1 = new Bureau(1,1);
        Bureau b2 = new Bureau(2,2);

        b1.ajouterChercheur(c1);
        b1.ajouterChercheur(c2);
        b1.affiche();
        b2.ajouterChercheur(c3);
        b2.affiche();

        Laboratoire L = new Laboratoire("Techtoo","Technologie");

        L.ajouterBureau(b1);
        L.ajouterBureau(b2);
        L.affiche();

        System.out.println(" quel bureau nombre superieur de chercheurs ? \n Bureau 1 " +b1.getNbChercheurs()
        +" Ou bureau 2 "+ b2.getNbChercheurs());

        b1.Supprimer(c1);
        System.out.println("Nb total de chercheurs : " +L.nbrChercheurTotal());

    }
}