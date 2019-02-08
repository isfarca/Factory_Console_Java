package headfirst.factory.pizzaaf;

public class ThunfischPizza extends Pizza {
	PizzaZutatenFabrik zutatenFabrik;
 
	public ThunfischPizza(PizzaZutatenFabrik zutatenFabrik) {
		this.zutatenFabrik = zutatenFabrik;
	}
 
	void vorbereiten() {
		System.out.println("Mache " + name);
		teig = zutatenFabrik.erstelleTeig();
		so�e = zutatenFabrik.erstelleSo�e();
		k�se = zutatenFabrik.erstelleK�se();
		gem�se = zutatenFabrik.erstelleGem�se();
		thunfisch = zutatenFabrik.erstelleThunfisch();
	}
}
