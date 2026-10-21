public class MacronutrientDriver {
    public static void main(String[] args) {
        MacronutrientAbstractFactory mealFactory = MacronutrientMealFactory.getInstance();

        Customer[] customers = new Customer[] {
                new Customer("Costumer1 (No Restriction)", DietPlan.NO_RESTRICTION),
                new Customer("Customer2 (Paleo)", DietPlan.PALEO),
                new Customer("Customer3 (Vegan)", DietPlan.VEGAN),
                new Customer("Customer4 (Nut Allergy)", DietPlan.NUT_ALLERGY),
                new Customer("Customer5 (Paleo)", DietPlan.PALEO),
                new Customer("Customer6 (Vegan)", DietPlan.VEGAN)
        };

        System.out.println("MACRONUTRIENT BALANCED MEAL ORDERS");

        for (Customer customer : customers) {
            System.out.println("Customer:  " + customer.getName());
            System.out.println("Diet Plan: " + customer.getDietPlan());
            Meal meal = mealFactory.createMeal(customer);
            meal.display();
            System.out.println();
        }
    }
}