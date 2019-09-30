public class Menu {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Tequila Sunrise";
        drink.price = 25.50;
        drink.alcoholic = true;

        drink.ingredient1 = new Ingredient();
        drink.ingredient1.name = "tequila ";
        drink.ingredient1.volume = 50;

        drink.ingredient2 = new Ingredient();
        drink.ingredient2.name = "orange juice ";
        drink.ingredient2.volume = 100;

        drink.ingredient3 = new Ingredient();
        drink.ingredient3.name = "grenadina ";
        drink.ingredient3.volume = 20;

        System.out.println("Name: " + drink.name + "\n"
                + "Price: " + drink.price + "zł" + "\n"
                + "Alcohol: " + drink.alcoholic + "\n"
                + "Ingredients: " + drink.ingredient1.name + drink.ingredient1.volume + "ml, "
                + drink.ingredient2.name + drink.ingredient2.volume + "ml, "
                + drink.ingredient3.name + drink.ingredient3.volume + "ml, " + "\n"
                + "Volume: " + (drink.ingredient1.volume + drink.ingredient2.volume + drink.ingredient3.volume) + " ml");
    }
}