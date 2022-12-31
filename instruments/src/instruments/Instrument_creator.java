package instruments;

public class Instrument_creator extends Functions_Attributes {

	/* Constructors */

	public Instrument_creator() {
		super();
	}

	public Instrument_creator(String name, double price, String type) {
		super(name, price, type);
	}

	/* Function */

	@Override
	public void play() {
		System.out.println("Esta sonando el instrumento " + getName() + " y es de " + getType());
	}

}
