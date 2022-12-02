package EX3;

import java.util.Date;
public class Ex3 {
    public static void main(String[] args ){
        Filiere[] filiere = new Filiere[3];

        filiere[0]= new Filiere("INFO ", "Informatique et multimedia ");
        filiere[1]= new Filiere("TELECOM ", "telecommunication ");
        filiere[2]= new Filiere("IOT", "Systemes embarques et iot");

        System.out.println("la liste des filieres de notre institut sont : ");
        for( int i=0 ; i<3 ; i++)
            System.out.println(filiere[i]);
        Etudiant etudiant[] =  new Etudiant[5];
        etudiant[0] = new Etudiant("Rashid","Mohamed",new Date("1995/01/02"),filiere[0]);
        etudiant[1] = new Etudiant("Yves","Chakib",new Date("1992/04/02"),filiere[0]);
        etudiant[2] = new Etudiant("Safi","Meriem",new Date("2000/11/02"),filiere[2]);
        etudiant[3] = new Etudiant("Rami","Mouad",new Date("2013/01/02"),filiere[2]);
        etudiant[4] = new Etudiant("Alaoui","Manal",new Date("2011/03/02"),filiere[1]);

        System.out.println("liste des etudiants par filiere : ");
        for ( int i=0 ; i<3 ; i++){
            System.out.println(filiere[i]);
                if(etudiant[i].getFiliere().getId() == filiere[i].getId()){
                System.out.println("\t\t" + etudiant[i]);
            }

        }

    }
}
