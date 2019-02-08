package headfirst.factory.pizzafm;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String teig;
	String so�e;
	ArrayList bel�ge = new ArrayList();
 
	void vorbereiten() {
		System.out.println("Bereite " + name);
		System.out.println("Werfe Teig ...");
		System.out.println("F�ge So�e hinzu...");
		System.out.println("F�ge Bel�ge hinzu: ");
		for (int i = 0; i < bel�ge.size(); i++) {
			System.out.println("   " + bel�ge.get(i));
		}
	}
  
	void backen() {
		System.out.println("Backe 25 Minuten bei 350");
	}
 
	void schneiden() {
		System.out.println("Schneide die Pizza diagonal in St�cke");
	}
  
	void verpacken() {
		System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer anzeige = new StringBuffer();
		anzeige.append("---- " + name + " ----\n");
		anzeige.append(teig + "\n");
		anzeige.append(so�e + "\n");
		for (int i = 0; i < bel�ge.size(); i++) {
			anzeige.append((String )bel�ge.get(i) + "\n");
		}
		return anzeige.toString();
	}
}

 
 
