public class Meal {
    private final Carb carb;
    private final Protein protein;
    private final Fat fat;

    public Meal(Carb carb, Protein protein, Fat fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    public void display() {
        System.out.println("  - Carb:    " + carb.getName());
        System.out.println("  - Protein: " + protein.getName());
        System.out.println("  - Fat:     " + fat.getName());
    }
}