import java.util.Iterator;
import java.util.Vector;

public class ListeDeDocuments {
    private Vector<Document> liste = new Vector();

    public ListeDeDocuments() {
    }

    public void ajout(Document d) {
        if (!this.liste.contains(d)) {
            this.liste.add(d);
        } else {
            System.err.println(d.getTitre() + " exsite déjà");
        }

    }

    public void supprimer(Document d) {
        if (this.liste.contains(d)) {
            this.liste.remove(d);
        } else {
            System.err.println(d.getTitre() + " n'exsite pas");
        }

    }

    public void tousLesDocuments() {
        System.out.println(">> >> >> Tous les types de documents");
        Iterator var2 = this.liste.iterator();

        while(var2.hasNext()) {
            Document d = (Document)var2.next();
            System.out.println(d);
        }

    }

    public void tousLesLivres() {
        System.out.println(">> >> >> Seulement les livres");
        Iterator var2 = this.liste.iterator();

        while(var2.hasNext()) {
            Document d = (Document)var2.next();
            if (d instanceof Livre) {
                System.out.println(d);
            }
        }

    }
}
