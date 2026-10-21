public abstract class MacronutrientAbstractFactory {
    public abstract CarbFactory getCarbFactory();
    public abstract ProteinFactory getProteinFactory();
    public abstract FatFactory getFatFactory();
    public abstract Meal createMeal(Customer customer);
}