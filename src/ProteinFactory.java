import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinFactory {
    private static ProteinFactory instance = null;
    private final Random random = new Random();

    private ProteinFactory() {}

    public static synchronized ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    public Protein createProtein(DietPlan dietPlan) {
        List<String> options = new ArrayList<>();
        switch (dietPlan) {
            case PALEO:
                options.add("Fish");
                options.add("Chicken");
                options.add("Beef");
                break;
            case VEGAN:
                options.add("Tofu");
                break;
            case NUT_ALLERGY:
            case NO_RESTRICTION:
            default:
                options.add("Fish");
                options.add("Chicken");
                options.add("Beef");
                options.add("Tofu");
                break;
        }

        String chosen = options.get(random.nextInt(options.size()));
        switch (chosen) {
            case "Fish": return new Fish();
            case "Chicken": return new Chicken();
            case "Beef": return new Beef();
            case "Tofu": return new Tofu();
            default: throw new IllegalStateException("Unknown Protein: " + chosen);
        }
    }
}