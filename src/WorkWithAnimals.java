import java.awt.List;
import java.util.ArrayList;

public class WorkWithAnimals {

	public static void main(String[] args) {

		Dog Fido = new Dog();
		
		Fido.setName("Fido");
		System.out.println(Fido.getName());
		
		Fido.digHole();
		
		Fido.setWeight(-1);
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says: " + doggy.getSound());
		System.out.println("Kitty says: " + kitty.getSound());
		
		
		ArrayList<Animal> animaltypes = new ArrayList<Animal>();
		
		animaltypes.add(doggy);
		animaltypes.add(kitty);
		
		for(Animal s : animaltypes){
			
			System.out.println(s.getSound());
		}
		
		Giraffe giraffe = new Giraffe();
		
		giraffe.setName("Frank");
		
		System.out.println(giraffe.getName());
		
		

	}

}
