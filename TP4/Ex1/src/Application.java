public class Application {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("med","fraj ","65678754");
        Etudiant e2 = new Etudiant("meriem","ameur ","8743543");
        Employe em1 = new Employe("rachid","douk ",1000.0);
        Employe em2 = new Employe("ali","ben salah ",855.0);
        Professeur p1 = new Professeur("haythem", "alaoui ",2700.0,"JAVA/JEE");
        Professeur p2 = new Professeur("hana", " ben cheick ", 3200.0,"Mathematique");
        System.out.println("*****Liste des employes *******\n");
        System.out.println(em1.toString());
        System.out.println(em2.toString());
        System.out.println("******Liste des etudiants ******\n");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println("********Liste des professeurs*****\n");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}