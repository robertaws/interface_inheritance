package interface_inheritances;

public class Child_6 extends BaseCharacter implements IDriver{

	public Child_6(String name, String description) {
		super(name, description);
	}

	@Override
	public void Drive() {
		System.out.println(name+" menyetir");		
	}

}
