package Home;
import java.time.LocalDate;
import java.time.Month;

public class FamilyTree {
	
	public static void main(String[] args) { 
        System.out.println("Welcome to the Family Tree Creator!");
                
        Human firstHuman = new Human("p1", LocalDate.of(1980, Month.MARCH, 2), null);
        Human secondHuman = new Human("p2", LocalDate.of(1960, Month.JUNE, 14), null);
        
        secondHuman.addDescendant(firstHuman);
        System.out.print(firstHuman.name + "\t");
        System.out.println(firstHuman.birthdate);
        System.out.print(secondHuman.name + "\t");
        System.out.println(secondHuman.birthdate);
        System.out.println("Children of " + secondHuman.name + " :");
        secondHuman.displayDescendants();
	}

	
}
