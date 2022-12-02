import java.util.ArrayList;
import java.util.List;

public class String {
    public static void main(java.lang.String[] args) {
        java.lang.String s1="abc";
        java.lang.String s2="";
        java.lang.String s3="un \" guillemet " ;
        java.lang.String s4 = " et hop \n une nouvelle Ligne ";
        java.lang.String s5="1.256355e-3";
        List<Integer > l = new ArrayList<Integer>();
        java.lang.String s="" ;
        System.out.println(s);
        System.out.println(s1);
        System.out.println("la longeur de s1 est "+ s1.length());
        System.out.println("s1 en majuscule est "+ s1.toUpperCase());
        System.out.println(s1.equals("abc"));
        System.out.println(s1.equals("agc3 monde"));
        System.out.println("le 2eme caractere de s1 : " + s1.substring(2));
        System.out.println("Remplaçage" + s1.replace("a","d"));
        System.out.println("l'indice de c dans s1 est "+ s1.indexOf("c"));
        System.out.println("concatenation de s3 et s4 "+ s3.concat(s4));
        System.out.println(" 1ere maniere de s5 en nombre : \n "+ Double.valueOf(s5));
        System.out.println("le 2eme maniere de s5 en nombre : \n "+ Double.parseDouble(s5) );
        System.out.println("la valeur maximale de Short est : " + Short.MAX_VALUE);
        System.out.println("la valeur minimale de Byte est : " + Byte.MIN_VALUE);
        l.add(3);
        l.add(5);
        l.add(18);
        System.out.println(" la liste l est " + l );


    }
}


