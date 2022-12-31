package instruments;

/*Attributes*/
public abstract class Functions_Attributes {
	private String name;
	private double price;
	private String type;

	/* Constructors */

	public Functions_Attributes(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;		
		this.type = type;
	}

	/* Getters and Setters */

	public Functions_Attributes() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/* Functions */

	public abstract void play();

	/* ToString */

	@Override
	public String toString() {
		return "Functions_Attributes [name=" + name + ", price=" + price + "]";
	}

}
