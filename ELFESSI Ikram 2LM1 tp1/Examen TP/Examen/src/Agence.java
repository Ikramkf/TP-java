public class Agence {
    public static void main(String[] args) {
       Aérien a1 = new Aérien("monji" , "sassi " ,"sassimonj@gmail.com",450.0,6555 );
       Aérien a2 = new aérienFidèle("taher","ajimi", "ajta@gmail.com",350.0,6554);
       Maritime m1 = new Maritime("fardawss","limen","limfer@gmail.com" , 560.0,2502);
       Maritime m2= new maritimeFidèle("adel","tej","tejad@gmail.com",560.0,2503);

        System.out.println("***La liste des voyageurs aériens : *** ");
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        System.out.println("***La liste des voyageurs Maritimes : ***");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}