import java.time.LocalDate;
import java.util.ArrayList;

public class Human {
	public int id;
	public String name;
	LocalDate birthdate;
	LocalDate deathdate;
	Human parentOne;
	Human parentTwo;
	ArrayList<Human> descendant = new ArrayList<Human>();

	private static int nextId=0;
	
	public Human(String name, LocalDate birthdate, LocalDate deathdate) {
		super();
		this.id = nextId;
		nextId++;
		this.name = name;
		this.birthdate = birthdate;
		this.deathdate = deathdate;
		// Add empty parent Human
		// Add empty parent Human
	}
	
	public Human(String name, LocalDate birthdate) {
		super();
		this.id = nextId;
		nextId++;
		this.name = name;
		this.birthdate = birthdate;
		this.deathdate = null;
		// Add empty parent Human
		// Add empty parent Human
	}
	
	public void addDescendant(Human child){
		this.descendant.add(child);
	}
	
	public void displayDescendants(){
		for(Human i : this.descendant)
			System.out.println(i.name);
	}
	
	public void addParent(Human parent){
		if(this.parentOne == null){
			this.parentOne =  parent; 
		} else if (this.parentTwo == null){
			this.parentTwo = parent;
		} else {
			System.out.println("Already has two parents. Maybe you want to remove one.");
		}
	}

	public void displayParents(){
		if(this.parentOne != null)
		System.out.println(this.parentOne.name);
		if(this.parentTwo != null)
		System.out.println(this.parentTwo.name);

	}
	
	
}
