package instruments;

import java.util.*;

public class Orchestra {

	public static void main(String[] args) {
		// Variables and constants

		ArrayList<Instrument_creator> instruments = new ArrayList();
		Scanner in = new Scanner(System.in);
		int userOption = -1;
		Instrument_creator i;
		int j = 0;

		// Main code

		do {

			// userMenu

			System.out.println("Introduce una opción:\n" + "1: Crear un instrumento.\n" + "2: Buscar un instrumento.\n"
					+ "3: Eliminar un instrumento.\n" + "4: Hacer sonar el instrumento que has buscado.\n"
					+ "0: Salir del programa.");
			userOption = in.nextInt();

			switch (userOption) {

			case 1:

				i = instrumentFactory();
				instruments.add(i);
				System.out.println("Se ha creado el instrumento " + i.getName());
				break;

			case 2:
				
				//Variables.
				j = instrumentSearch(instruments);
				
				//Code.
				
				if (j>-1) {
					System.out.println("El instrumento que buscas es:" + instruments.get(j));
				}
				else {
					System.out.println("El instrumento que buscas no esta en nuestra base de datos.");
				}
				
				break;

			case 3:

				deleteInstrument(instrumentSearch(instruments), instruments);
				break;

			case 4:

				instruments.get(j).play();
				break;

			}

		} while (userOption != 0);

		System.out.println("Muchas gracias por utilizar nuestros servicios.");

	}

	// Methods

	// Method userOption 1

	public static Instrument_creator instrumentFactory() {

		// Variables, constants and functions.

		Scanner sc = new Scanner(System.in);
		Instrument_creator instrument = new Instrument_creator();
		String iName;
		String iType;
		double iPrice;

		// Method code.

		System.out.println("Introduce el nombre del instrumento:");
		iName = sc.nextLine();
		instrument.setName(iName);

		System.out.println("Introduce el tipo de instrumento:");
		iType = sc.nextLine();
		instrument.setType(iType);

		System.out.println("Introduce el precio del instrumento");
		iPrice = sc.nextDouble();
		instrument.setPrice(iPrice);

		// return.

		return instrument;

	}

	// Method userOption 2.

	public static int instrumentSearch(ArrayList<Instrument_creator> instruments) {

		// Variables, constants and functions

		Scanner src = new Scanner(System.in);
		String userSearch;
		boolean find = false;
		int size = instruments.size();
		int i = -1;
		int j = -1;

		// Method code.

		System.out.println("Introduce el nombre del instrumento:");
		userSearch = src.nextLine();

		do {
			i++;
			if (userSearch.equalsIgnoreCase(instruments.get(i).getName())) {
				find = true;
				j=i;
			}

		} while (!find && size > i);

		// return.

		return j;

	}

	// Method userOption 3.

	public static void deleteInstrument(int instrumentSearch, ArrayList<Instrument_creator> instruments) {

		// Variables, constants and functions

		int i = instrumentSearch;

		// Method code.

		System.out.println("El instrumento " + instruments.get(i).getName() + " ha sido eliminado correctamente.");
		instruments.remove(i);
	}

}
