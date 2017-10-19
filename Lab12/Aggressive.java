import java.util.List;
import java.util.ArrayList;
public class Aggressive{

    public static void main(String[] args){
	
	List<Person> roster = new ArrayList<>();
	roster.add(new Person("Abe", Person.Sex.MALE));
	roster.add(new Person("Barbara", Person.Sex.FEMALE));
	roster.add(new Person("Chris", Person.Sex.MALE));
	roster.add(new Person("Dorothy", Person.Sex.FEMALE));
	roster.add(new Person("Eugene", Person.Sex.MALE));
	roster.add(new Person("Fabian", Person.Sex.MALE));
	
	
	for (Person p : roster) {
	    
	    if (p.getGender() == Person.Sex.MALE) {
		
		System.out.println(p.getName());
		
	    }
	    
	}

	roster.stream()
	    .filter( e -> e.getGender() == Person.Sex.MALE )
	    .forEach( e -> System.out.println( e.getName() ) );



	
    }
}
