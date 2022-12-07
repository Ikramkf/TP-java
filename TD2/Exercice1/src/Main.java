public class Main {
    public static void main(String[] args) {
        Livre l1 = new Livre("Dance ","Philipe george",250);
        Livre l2 = new Livre("Love ","dina",300);
        Dictionnaire d1 = new Dictionnaire("Max","Français",15);

        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(d1.toString());
    }
}