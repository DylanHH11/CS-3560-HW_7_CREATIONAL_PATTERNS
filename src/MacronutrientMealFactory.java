public class MacronutrientMealFactory extends MacronutrientAbstractFactory {
    private static MacronutrientMealFactory instance = null;

    private MacronutrientMealFactory() {}

    public static synchronized MacronutrientMealFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientMealFactory();
        }
        return instance;
    }

    @Override
    public CarbFactory getCarbFactory() {
        return CarbFactory.getInstance();
    }

    @Override
    public ProteinFactory getProteinFactory() {
        return ProteinFactory.getInstance();
    }

    @Override
    public FatFactory getFatFactory() {
        return FatFactory.getInstance();
    }

    @Override
    public Meal createMeal(Customer customer) {
        DietPlan plan = customer.getDietPlan();
        Carb carb = getCarbFactory().createCarb(plan);
        Protein protein = getProteinFactory().createProtein(plan);
        Fat fat = getFatFactory().createFat(plan);
        return new Meal(carb, protein, fat);
    }
}