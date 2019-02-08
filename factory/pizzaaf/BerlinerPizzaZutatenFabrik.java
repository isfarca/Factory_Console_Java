package headfirst.factory.pizzaaf;

public class BerlinerPizzaZutatenFabrik implements PizzaZutatenFabrik {
 
	public Teig erstelleTeig() {
		return new TeigMitDuennerKruste();
	}
 
	public Sosse erstelleSo�e() {
		return new MarinaraSosse();
	}
 
	public Kaese erstelleK�se() {
		return new Parmesan();
	}
	
	public Salami erstelleSalami() {
		return new SpanischeSalami();
	}
	public Gemuese[] erstelleGem�se() {
		Gemuese gem�se[] = { new Knoblauch(), new Zwiebeln(), new Pilze(), new Paprika() };
		return gem�se;
	}
 
	public Thunfisch erstelleThunfisch() {
		return new ThunfischStuecke();
	}

	public Krabben erstelleKrabben() {
		return new FrischeKrabben();
	}
}
