import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbFactory {
    private static CarbFactory instance = null;
    private final Random random = new Random();

    private CarbFactory() {}

    public static synchronized CarbFactory getInstance() {
        if (instance == null) {
            instance = new CarbFactory();
        }
        return instance;
    }

    public Carb createCarb(DietPlan dietPlan) {
        List<String> options = new ArrayList<>();
        switch (dietPlan) {
            case PALEO:
                options.add("Pistachio");
                break;
            case VEGAN:
                options.add("Bread");
                options.add("Lentils");
                options.add("Pistachio");
                break;
            case NUT_ALLERGY:
                options.add("Cheese");
                options.add("Bread");
                options.add("Lentils");
                break;
            case NO_RESTRICTION:
            default:
                options.add("Cheese");
                options.add("Bread");
                options.add("Lentils");
                options.add("Pistachio");
                break;
        }

        String chosen = options.get(random.nextInt(options.size()));
        switch (chosen) {
            case "Cheese": return new Cheese();
            case "Bread": return new Bread();
            case "Lentils": return new Lentils();
            case "Pistachio": return new Pistachio();
            default: throw new IllegalStateException("Unknown Carb: " + chosen);
        }
    }
}