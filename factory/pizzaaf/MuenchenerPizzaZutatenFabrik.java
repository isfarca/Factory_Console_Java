package headfirst.factory.pizzaaf;

public class MuenchenerPizzaZutatenFabrik 
	implements PizzaZutatenFabrik 
{

	public Teig erstelleTeig() {
		return new TeigMitDickerKruste();
	}

	public Sosse erstelleSo�e() {
		return new Tomatensosse();
	}

	public Kaese erstelleK�se() {
		return new Mozzarella();
	}

	public Salami erstelleSalami() {
		return new ItalienischeSalami();
	}
	
	public Gemuese[] erstelleGem�se() {
		Gemuese gem�se[] = { new SchwarzeOliven(), 
		                      new Spinat(), 
		                      new Aubergine() };
		return gem�se;
	}

	public Thunfisch erstelleThunfisch() {
		return new ThunfischStuecke();
	}

	public Krabben erstelleKrabben() {
		return new GefroreneKrabben();
	}
}
