import java.time.LocalDate;
import java.util.ArrayList;

public class Human {
	public int id;
	public String name;
	LocalDate birthdate;
	LocalDate deathdate;
	Human[] parent = new Human[2];
	ArrayList<Human> descendant = new ArrayList<Human>();

	private static int nextId=0;
	
	public Human(String name, LocalDate birthdate, LocalDate deathdate) {
		this.id = nextId;
		nextId++;
		this.name = name;
		this.birthdate = birthdate;
		this.deathdate = deathdate;
		this.parent[0] = null;
		this.parent[1] = null;
		descendant.clear();
	}
	
	public Human(String name, LocalDate birthdate) {
		this.id = nextId;
		nextId++;
		this.name = name;
		this.birthdate = birthdate;
		this.deathdate = null;
		this.parent[0] = null;
		this.parent[1] = null;
		descendant.clear();
	}
	
	public void addDescendant(Human child){
		child.addParent(this);
	}
	
	public void displayDescendants(){
		for(Human i : this.descendant)
			System.out.println(i.name);
	}
	
	public void addParent(Human par){
		if(this.parent[0] == null){
			this.parent[0] =  par;
			par.descendant.add(this);
		} else if (this.parent[1] == null){
			this.parent[1] = par;
			par.descendant.add(this);
		} else {
			System.out.println("Already has two parents. Maybe you want to remove one.");
		}
	}

	public void displayParents(){
		if(this.parent[0] != null)
			System.out.println(this.parent[0].name);
		if(this.parent[1] != null)
			System.out.println(this.parent[1].name);
	}

	public void deleteParent(int num){
		if(num == 1){
			// Delete parent one relationship
			this.parent[0] = null;
		} else if(num == 2){
			// Delete parent two relationship
			this.parent[1] = null;
		} else {
			System.out.println("Not a valid parent id.");
		}
	}

	public void displayFamilyTree(int spaces){
		if( !this.hasChildren() ){
			for(int s=0; s<spaces; s++){ System.out.print("   ");}
			System.out.println(this.name);
			return;
		} else {
			for(int s=0; s<spaces; s++){ System.out.print("   ");}
			System.out.println(this.name);
			spaces+=1;
			for(Human hum : descendant){
				hum.displayFamilyTree(spaces);

			}	
		}
			
	}

	public boolean hasChildren(){
		if( descendant.isEmpty() ){
			return false;
		} else {
			return true;
		}
	}
	
}
