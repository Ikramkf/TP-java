public class Main {
    public static void main(String[] args) {
        Article tv = new Fragile("LG", 7000.00);
        Article machinealaver = new Fragile("Beko", 6500.00);
        Article refregerateur = new Fragile("SAMSUNG" , 5800.00);
        Article microondes = new Fragile ("WHIRPOOL",1800.00);

        Magasin magasin = new Magasin ();
        magasin.add(tv);
        magasin.add(machinealaver);
        magasin.add(refregerateur);
        magasin.add(microondes);

        System.out.println("le prix de transport de l'article tv  est " + tv.prixTransport());
        System.out.println("****** Liste de tous les articles : ********* \n");
        magasin.tousLesArticles();
        System.out.println("Test si l'article microondes est dans le magazin ou pas : " + magasin.contains(microondes));
        magasin.delete(microondes);
        System.out.println("L'article ayant le code " + microondes.getCode());
        System.out.println("****** Liste des articles restants ******* \n");
        magasin.tousLesArticles2();



    }
}