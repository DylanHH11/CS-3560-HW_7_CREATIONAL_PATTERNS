import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FatFactory {
    private static FatFactory instance = null;
    private final Random random = new Random();

    private FatFactory() {}

    public static synchronized FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }
        return instance;
    }

    public Fat createFat(DietPlan dietPlan) {
        List<String> options = new ArrayList<>();
        switch (dietPlan) {
            case PALEO:
                options.add("Avocado");
                options.add("Tuna");
                options.add("Peanuts");
                break;
            case VEGAN:
                options.add("Avocado");
                options.add("Peanuts");
                break;
            case NUT_ALLERGY:
                options.add("Avocado");
                options.add("Sour cream");
                options.add("Tuna");
                break;
            case NO_RESTRICTION:
            default:
                options.add("Avocado");
                options.add("Sour cream");
                options.add("Tuna");
                options.add("Peanuts");
                break;
        }

        String chosen = options.get(random.nextInt(options.size()));
        switch (chosen) {
            case "Avocado": return new Avocado();
            case "Sour cream": return new SourCream();
            case "Tuna": return new Tuna();
            case "Peanuts": return new Peanuts();
            default: throw new IllegalStateException("Unknown Fat: " + chosen);
        }
    }
}