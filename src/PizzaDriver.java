public class PizzaDriver {
    public static void main(String[] args) {
        // Instantiate the chains
        PizzaHut pizzaHut = new PizzaHut();
        LittleCaesars littleCaesars = new LittleCaesars();
        Dominos dominos = new Dominos();

        System.out.println("PART 1: PIZZA HUT (3, 6, 9 TOPPINGS)");

        Pizza phSmall3 = pizzaHut.getPizzaBuilder()
                .setSize("Small")
                .addPepperoni()
                .addMushrooms()
                .addOnions()
                .build();

        Pizza phMed6 = pizzaHut.getPizzaBuilder()
                .setSize("Medium")
                .addPepperoni()
                .addSausage()
                .addBacon()
                .addExtraCheese()
                .addPeppers()
                .addOlives()
                .build();

        Pizza phLarge9 = pizzaHut.getPizzaBuilder()
                .setSize("Large")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .addChicken()
                .addSpinach()
                .addTomatoAndBasil()
                .build();

        phSmall3.eat();
        phMed6.eat();
        phLarge9.eat();

        System.out.println("PART 2: THREE PIZZA CHAINS (6 PIZZAS)");

        // Pizza Hut: Large with 3 toppings & Small with 2 toppings
        Pizza phLarge3 = pizzaHut.getPizzaBuilder()
                .setSize("Large")
                .addPepperoni()
                .addBacon()
                .addExtraCheese()
                .build();

        Pizza phSmall2 = pizzaHut.getPizzaBuilder()
                .setSize("Small")
                .addMushrooms()
                .addOnions()
                .build();

        // Little Caesars: Medium with 8 toppings & Small with 6 toppings
        Pizza lcMed8 = littleCaesars.getPizzaBuilder()
                .setSize("Medium")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .addPeppers()
                .addOlives()
                .build();

        Pizza lcSmall6 = littleCaesars.getPizzaBuilder()
                .setSize("Small")
                .addChicken()
                .addBeef()
                .addHam()
                .addPesto()
                .addSpicyPork()
                .addSpinach()
                .build();

        // Dominos: Small with 1 topping & Large with 3 toppings
        Pizza domSmall1 = dominos.getPizzaBuilder()
                .setSize("Small")
                .addHamAndPineapple()
                .build();

        Pizza domLarge3 = dominos.getPizzaBuilder()
                .setSize("Large")
                .addChicken()
                .addSpinach()
                .addTomatoAndBasil()
                .build();

        System.out.println("Pizza Hut Orders:");
        phLarge3.eat();
        phSmall2.eat();

        System.out.println("Little Caesars Orders:");
        lcMed8.eat();
        lcSmall6.eat();

        System.out.println("Dominos Orders:");
        domSmall1.eat();
        domLarge3.eat();
    }
}