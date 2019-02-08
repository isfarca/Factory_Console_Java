package headfirst.factory.pizzafm;

public class BerlinerVegetarischePizza extends Pizza {

	public BerlinerVegetarischePizza() {
		name = "Vegetarische Pizza Berliner Art";
		teig = "Teig mit fester Kruste";
		so�e = "Marinara-So�e";
 
		bel�ge.add("Geriebener Parmesan");
		bel�ge.add("Knoblauch");
		bel�ge.add("Zwiebeln");
		bel�ge.add("Pilze");
		bel�ge.add("Rote Paprika");
	}
}
