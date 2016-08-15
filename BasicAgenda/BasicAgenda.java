/*
	This Basic Agenda program.

	It uses clases:
		Professor.java
		Project.java

	An SQL Database


*/

public class BasicAgenda {

    public static void main(String[] args) {

        System.out.println("Beginning of this Basis Agenda");

        Professor prof1 = new Professor("Marcela", "EyM", "marcela@mail.com");
        Professor prof2 = new Professor("Alberto", "medios", "alberto@mail.com");
    	
        System.out.println(prof1.name);
        System.out.println(prof2.name);


    }


}