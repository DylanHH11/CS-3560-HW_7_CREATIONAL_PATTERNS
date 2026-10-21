import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private final String chain;
    private String size;
    private final List<String> toppings = new ArrayList<>();

    public PizzaBuilder(String chain) {
        this.chain = chain;
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public PizzaBuilder addPepperoni() { return addTopping("Pepperoni"); }
    public PizzaBuilder addSausage() { return addTopping("Sausage"); }
    public PizzaBuilder addMushrooms() { return addTopping("Mushrooms"); }
    public PizzaBuilder addBacon() { return addTopping("Bacon"); }
    public PizzaBuilder addOnions() { return addTopping("Onions"); }
    public PizzaBuilder addExtraCheese() { return addTopping("Extra Cheese"); }
    public PizzaBuilder addPeppers() { return addTopping("Peppers"); }
    public PizzaBuilder addChicken() { return addTopping("Chicken"); }
    public PizzaBuilder addOlives() { return addTopping("Olives"); }
    public PizzaBuilder addSpinach() { return addTopping("Spinach"); }
    public PizzaBuilder addTomatoAndBasil() { return addTopping("Tomato and Basil"); }
    public PizzaBuilder addBeef() { return addTopping("Beef"); }
    public PizzaBuilder addHam() { return addTopping("Ham"); }
    public PizzaBuilder addPesto() { return addTopping("Pesto"); }
    public PizzaBuilder addSpicyPork() { return addTopping("Spicy Pork"); }
    public PizzaBuilder addHamAndPineapple() { return addTopping("Ham and Pineapple"); }

    public Pizza build() {
        if (size == null || size.trim().isEmpty()) {
            throw new IllegalStateException("Size is required and must be set (Small, Medium, or Large)!");
        }
        if (!size.equalsIgnoreCase("Small") &&
                !size.equalsIgnoreCase("Medium") &&
                !size.equalsIgnoreCase("Large")) {
            throw new IllegalArgumentException("Invalid size: " + size + ". Must be Small, Medium, or Large.");
        }
        return new Pizza(chain, size, toppings);
    }
}