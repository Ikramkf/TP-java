public class Main {
    public static void main(String[] args) {
        EtudiantLicence e1 = new EtudiantLicence("Ahmed","Sousse",12,"CS");
        EtudiantMaster e2 = new EtudiantMaster("Olfa", "Tunis",14,"IA");
        EtudiantDoctorat e3 = new EtudiantDoctorat("Mohamed","Tunis",8,"Dev");

        e1.afficherProfil();
        e1.afficher();
        e1.afficher(true);
        e1.afficher(false);
        e2.afficherProfil();
        e2.afficher();
        e3.afficherProfil();
        e3.afficher();


    }
}