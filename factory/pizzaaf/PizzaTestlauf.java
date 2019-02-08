package headfirst.factory.pizzaaf;

public class PizzaTestlauf {
 
	public static void main(String[] args) {
		Pizzeria berlinPizzeria = new BerlinerPizzeria();
		Pizzeria m�nchenPizzeria = new MuenchenerPizzeria();
 
		Pizza pizza = berlinPizzeria.bestellePizza("Salami");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = m�nchenPizzeria.bestellePizza("Salami");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");

		pizza = berlinPizzeria.bestellePizza("Krabben");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = m�nchenPizzeria.bestellePizza("Krabben");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");

		pizza = berlinPizzeria.bestellePizza("Thunfisch");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = m�nchenPizzeria.bestellePizza("Thunfisch");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");

		pizza = berlinPizzeria.bestellePizza("Vegetarisch");
		System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");
 
		pizza = m�nchenPizzeria.bestellePizza("Vegetarisch");
		System.out.println("Joel hat eine " + pizza.getName() + " bestellt\n");
 	}
}
