package headfirst.factory.pizzaaf;

public class MuenchenerPizzeria extends Pizzeria {

	protected Pizza erstellePizza(String item) {
		Pizza pizza = null;
		PizzaZutatenFabrik zutatenFabrik =
		new MuenchenerPizzaZutatenFabrik();

		if (item.equals("Salami")) {

			pizza = new SalamiPizza(zutatenFabrik);
			pizza.setName("Salami-Pizza M�nchener Art");

		} else if (item.equals("Vegetarisch")) {

			pizza = new VegetarischePizza(zutatenFabrik);
			pizza.setName("Vegetarische Pizza M�nchener Art");

		} else if (item.equals("Krabben")) {

			pizza = new KrabbenPizza(zutatenFabrik);
			pizza.setName("Krabben-Pizza M�nchener Art");

		} else if (item.equals("Thunfisch")) {

			pizza = new ThunfischPizza(zutatenFabrik);
			pizza.setName("Thunfisch-Pizza M�nchener Art");

		}
		return pizza;
	}
}
