package headfirst.factory.pizzaaf;

public interface PizzaZutatenFabrik {
 
	public Salami erstelleSalami();
	public Teig erstelleTeig();
	public Sosse erstelleSo�e();
	public Kaese erstelleK�se();
	public Gemuese[] erstelleGem�se();
	public Thunfisch erstelleThunfisch();
	public Krabben erstelleKrabben();
 
}
