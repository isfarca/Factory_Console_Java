package headfirst.factory.pizzafm;

public class BerlinerKrabbenPizza extends Pizza {

	public BerlinerKrabbenPizza() {
		name = "Krabben-Pizza Berliner Art";
		teig = "Teig mit fester Kruste";
		so�e = "Marinara-So�e";
 
		bel�ge.add("Geriebener Parmesan");
		bel�ge.add("Knoblauch");
		bel�ge.add("Frische Nordsee-Krabben");
	}
}
