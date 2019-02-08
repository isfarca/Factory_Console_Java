package headfirst.factory.pizzaaf;

public class KrabbenPizza extends Pizza {
	PizzaZutatenFabrik zutatenFabrik;
 
	public KrabbenPizza(PizzaZutatenFabrik zutatenFabrik) {
		this.zutatenFabrik = zutatenFabrik;
	}
 
	void vorbereiten() {
		System.out.println("Mache " + name);
		teig = zutatenFabrik.erstelleTeig();
		so�e = zutatenFabrik.erstelleSo�e();
		k�se = zutatenFabrik.erstelleK�se();
		krabben = zutatenFabrik.erstelleKrabben();
	}
}
