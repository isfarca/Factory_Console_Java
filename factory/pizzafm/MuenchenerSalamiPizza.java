package headfirst.factory.pizzafm;

public class MuenchenerSalamiPizza extends Pizza {

	public MuenchenerSalamiPizza() { 
		name = "Deftige Salami-Pizza im M�nchener Stil";
		teig = "Teig mit extra dicker Kruste";
		so�e = "Tomatenso�e";
 
		bel�ge.add("Salami");
		bel�ge.add("Mozzarella");
	}
 
	void schneiden() {
		System.out.println("Schneide die Pizza in rechteckige St�cke");
	}
}
