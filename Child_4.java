package interface_inheritances;

public class Child_4 extends BaseCharacter implements IChef{

	public Child_4(String name, String description) {
		super(name, description);
	}

	@Override
	public void Cook() {
		System.out.println(name+" memasak");		
	}


}
