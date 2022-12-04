public class Salaires {
    public static void main(String[] args) {
        Personnel p = new Personnel();
        p.ajouterEmploye(new Vendeur("Pierre","Buisness", 45, "1995",30000));
        p.ajouterEmploye(new Representant("leon","Vendtout",25,"2001",20000));
        p.ajouterEmploye(new Technicien("Yves","bosseur",28,"1998",1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne","Stocketout",32,"1998",45));
        p.ajouterEmploye(new TechnicienArisque("jean","flippe",28,"2000",1000));
        p.ajouterEmploye(new ManutentionnaireArisque("Al","Aborfage",30,"2001",45));

        p.calculerSalaires();
        System.out.println("Le salaire moyen dans l'entreprise est "+p.salaireMoyen()+ "  euros ");
}}