package interface_inheritances;

public class BaseCharacter {
	String name;
	String description;
	

	public BaseCharacter(String name, String description) {
		this.name = name;
		this.description = description;
	}


	void getinfo() {
		System.out.println(name+" "+description);
	}
	
}
