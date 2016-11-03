import java.time.LocalDate;
import java.util.ArrayList;

public class Human {
	public int id;
	public String name;
	LocalDate birthdate;
	LocalDate deathdate;
	int parentOneId;
	int parentTwoId;
	ArrayList<Human> descendant = new ArrayList<Human>();

	private static int nextId=0;
	
	public Human(String name, LocalDate birthdate, LocalDate deathdate) {
		super();
		this.id = nextId;
		nextId++;
		this.name = name;
		this.birthdate = birthdate;
		this.deathdate = deathdate;
	}
	
	public Human(String name, LocalDate birthdate) {
		super();
		this.id = nextId;
		nextId++;
		this.name = name;
		this.birthdate = birthdate;
	}
	
	public void addDescendant(Human child){
		this.descendant.add(child);
	}
	
	public void displayDescendants(){
		for(Human i : this.descendant)
			System.out.println(i.name);
	}
	
	
	
	
}
