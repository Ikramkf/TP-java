public class Bibliothèque {
    public Bibliothèque() {
    }

    public static void main(String[] args) {
        Document a = new Document(1001, "Mode d'emploi du lave-vaisselle");
        Livre b = new Livre(1002, "Guerre et paix", "Leon Tolstoi", 2750);
        Dictionnaire c = new Dictionnaire(1003, "Larousse", "Espagnol", 32000);
        Livre d = new Livre(1004, "Les miserables", "Victor Hugo", 800);
        ListeDeDocuments l = new ListeDeDocuments();
        l.ajout(a);
        l.ajout(b);
        l.ajout(c);
        l.ajout(d);
        l.tousLesDocuments();
        l.tousLesLivres();
        l.ajout(a);
        l.supprimer(a);
        System.out.println("\n\t\t<< << << Ré-affichage >> >> >>\n");
        l.tousLesDocuments();
        l.tousLesLivres();
    }
}