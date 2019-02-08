package headfirst.factory.pizzafm;

public class MuenchenerThunfischPizza extends Pizza {
	public MuenchenerThunfischPizza() {
		name = "Thunfisch-Pizza M�nchener Art";
		teig = "Teig mit extra dicker Kruste";
		so�e = "Tomatenso�e";
 
		bel�ge.add("Mozzarella");
		bel�ge.add("Schwarze Oliven");
		bel�ge.add("Thunfisch");
		bel�ge.add("Kapern");
	}
 
	void schneiden() {
		System.out.println("Schneide Pizza in rechteckige St�cke");
	}
}
