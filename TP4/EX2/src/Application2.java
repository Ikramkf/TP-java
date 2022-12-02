public class Application2 {
    public static void main(String[] args) {
        Developpeur d1 = new Developpeur("karim", "salim" , "karim@gmail.com","98641215",800,"PHP");
        Developpeur d2 = new Developpeur("mounir ","ali ","alimou@gmail.com","45876132",850,"JAVA/JEE");
        Manager m1 = new Manager("olfa ", "mohamed","moolf@gmail.com","97456254",1200,"Production");
        Manager m2 = new Manager("mohamed","lachghar","lamo@gmail.com","98756412",1400,"Informatique");

        System.out.println(m2.toString());
        System.out.println(d1.toString());
        System.out.println(d2.toString());

    }
}