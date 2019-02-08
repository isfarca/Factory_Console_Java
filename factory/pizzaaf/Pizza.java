package headfirst.factory.pizzaaf;

public abstract class Pizza {
	String name;

	Teig teig;
	Sosse so�e;
	Gemuese gem�se[];
	Salami salami;
	Kaese k�se;
	Thunfisch thunfisch;
	Krabben krabben;

	abstract void vorbereiten();

	void backen() {
		System.out.println("Backe 25 Minuten bei 350");
	}
 
	void schneiden() {
		System.out.println("Schneide die Pizza diagonal in St�cke");
	}
  
	void verpacken() {
		System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
	}
 
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer ergebnis = new StringBuffer();
		ergebnis.append("---- " + name + " ----\n");
		if (teig != null) {
			ergebnis.append(teig);
			ergebnis.append("\n");
		}
		if (so�e != null) {
			ergebnis.append(so�e);
			ergebnis.append("\n");
		}
		if (k�se != null) {
			ergebnis.append(k�se);
			ergebnis.append("\n");
		}
		if (salami != null) {
			ergebnis.append(salami);
			ergebnis.append("\n");
		}
		if (gem�se != null) {
			for (int i = 0; i < gem�se.length; i++) {
				ergebnis.append(gem�se[i]);
				if (i < gem�se.length-1) {
					ergebnis.append(", ");
				}
			}
			ergebnis.append("\n");
		}
		if (krabben != null) {
			ergebnis.append(krabben);
			ergebnis.append("\n");
		}
		if (thunfisch != null) {
			ergebnis.append(thunfisch);
			ergebnis.append("\n");
		}
		return ergebnis.toString();
	}
}
