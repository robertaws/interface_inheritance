package interface_inheritances;

public class Child_3 extends BaseCharacter implements IChef,IArtist,IDriver,IWorker{

	public Child_3(String name, String description) {
		super(name, description);
	}

	@Override
	public void Work() {
		System.out.println(name+" bekerja");
	}

	@Override
	public void Drive() {
		System.out.println(name+" menyetir");
	}

	@Override
	public void Paint() {
		System.out.println(name+" melukis");
	}

	@Override
	public void Cook() {
		System.out.println(name+" memasak");
	}


}
