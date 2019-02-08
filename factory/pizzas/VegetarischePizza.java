package headfirst.factory.pizzas;

public class VegetarischePizza extends Pizza {
	public VegetarischePizza() {
		name = "Vegetarische Pizza";
		teig = "Kruste";
		so�e = "Marinara-So�e";
		bel�ge.add("Mozzarella");
		bel�ge.add("Geriebener Parmesan");
		bel�ge.add("Gew�rfelte Zwiebeln");
		bel�ge.add("Pilze in Scheiben");
		bel�ge.add("Rote Paprika in Scheiben");
		bel�ge.add("Schwarze Oliven in Scheiben");
	}
}
