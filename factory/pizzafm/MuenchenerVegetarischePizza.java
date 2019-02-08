package headfirst.factory.pizzafm;

public class MuenchenerVegetarischePizza extends Pizza {
	public MuenchenerVegetarischePizza() {
		name = "Deftige vegetarische Pizza M�nchener Art";
		teig = "Teig mit extra dicker Kruste";
		so�e = "Tomatenso�e";
 
		bel�ge.add("Mozzarella");
		bel�ge.add("Schwarze Oliven");
		bel�ge.add("Spinat");
		bel�ge.add("Aubergine");
	}
 
	void schneiden() {
		System.out.println("Schneide die Pizza in rechteckige St�cke");
	}
}
