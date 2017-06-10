
public class Animal {
	
	private String name;
	private int weight;
	private String sound;
	
	public void setName(String newName){
		
		this.name = newName;
	}
	
	public String getName(){
		
		return name;
	}
	
	public void setWeight(int newWeight){
		
		if(newWeight > 0){
			this.weight = newWeight;
		}
		else {
			System.out.println("Weight must be greater than 0");
		}
		
	}
	
	public int getWeight(){
		
		return weight;
	}
	
	public void setSound(String newSound){
		
		this.sound= newSound;
	}
	
	public String getSound(){
		
		return sound;
	}

}
