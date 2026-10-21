import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String chain;
    private final String size;
    private final List<String> toppings;

    // Package-private constructor called only by PizzaBuilder
    Pizza(String chain, String size, List<String> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = new ArrayList<>(toppings);
    }

    public String getChain() { return chain; }
    public String getSize() { return size; }
    public List<String> getToppings() { return toppings; }

    public void eat() {
        System.out.println("Pizza Chain: " + chain);
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + String.join(", ", toppings));
        System.out.println();
    }
}