public class Menu {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Tequila Sunrise";
        drink.price = 25.50;
        drink.alcohol = true;

        Ingredients ingredient1 = new Ingredients();
        ingredient1.name = "tequila ";
        ingredient1.volume = 50 ;

        Ingredients ingredient2 = new Ingredients();
        ingredient2.name = "orange juice ";
        ingredient2.volume = 100;

        Ingredients ingredient3 = new Ingredients();
        ingredient3.name = "grenadina ";
        ingredient3.volume = 20;

        System.out.println("Name: " + drink.name +"\n"
                + "Price: " + drink.price + "zł" + "\n"
                + "Alcohol: " + drink.alcohol +"\n"
                + "Ingredients: " + ingredient1.name + ingredient1.volume + "ml, "
                + ingredient2.name + ingredient2.volume + "ml, "
                + ingredient3.name + ingredient3.volume + "ml, " + "\n"
                + "Volume: " + (ingredient1.volume + ingredient2.volume + ingredient3.volume) + " ml");
    }
}