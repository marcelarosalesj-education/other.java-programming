import java.time.LocalDate;
import java.time.Month;

public class FamilyTree {
	
	public static void main(String[] args) { 
        System.out.println("Welcome to the Family Tree Creator!");
                
        Human h1 = new Human("h1", LocalDate.of(1980, Month.JANUARY, 1), null);
        Human h2 = new Human("h2", LocalDate.of(1970, Month.FEBRUARY, 5), null);
        Human h3 = new Human("h3", LocalDate.of(1960, Month.MARCH, 11), null);
        Human h4 = new Human("h4", LocalDate.of(1950, Month.APRIL, 14), null);
        Human h5 = new Human("h5", LocalDate.of(1940, Month.MAY, 23), null);
        Human h6 = new Human("h6", LocalDate.of(1930, Month.JUNE, 27), null);
        Human h7 = new Human("h7", LocalDate.of(1935, Month.MARCH, 13), null);
        Human h8 = new Human("h8", LocalDate.of(1945, Month.JULY, 15), null);
        Human h9 = new Human("h9", LocalDate.of(1955, Month.DECEMBER, 16), null);
        Human h10 = new Human("h10", LocalDate.of(1965, Month.OCTOBER, 17), null);        

        h1.addDescendant(h3);
        h1.addDescendant(h4);

        h2.addDescendant(h3);
        h2.addDescendant(h5);

        h3.addDescendant(h9);
        h3.addDescendant(h10);
        
        h4.addDescendant(h6);
        h4.addDescendant(h7);
        h4.addDescendant(h8);

        System.out.println("- Display Tree -");
        h1.displayFamilyTree(0);
        h2.displayFamilyTree(0);

        }
}
