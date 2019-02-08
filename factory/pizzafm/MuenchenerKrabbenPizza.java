package headfirst.factory.pizzafm;

public class MuenchenerKrabbenPizza extends Pizza {
	public MuenchenerKrabbenPizza() {
		name = "Krabben-Pizza M�nchener Art";
		teig = "Teig mit extra dicker Kruste";
		so�e = "Tomatenso�e";
 
		bel�ge.add("Mozzarella");
		bel�ge.add("Gefrorene Krabben");
		bel�ge.add("Oliven");
	}
 
	void schneiden() {
		System.out.println("Schneide die Pizza in rechteckige St�cke");
	}
}
