package interface_inheritances;

public class Child_2 extends BaseCharacter implements IChef{

	public Child_2(String name, String description) {
		super(name, description);
	}

	@Override
	public void Cook() {
		System.out.println(name+" memasak");		
	}


}
