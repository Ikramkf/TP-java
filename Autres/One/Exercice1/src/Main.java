public class Main {
    public static void main(String[] args) {
        Vehicule v = new Vehicule("citadine");
        Voiture a = new Voiture("citadine",5,35251,1200);


        System.out.println(v.toString());
        System.out.println(a.toString());
    }
}