public class ChineseRestaurant implements Restaurant {
    private final String name;

    public ChineseRestaurant(String name) {
        this.name = name;
    }

    @Override
    public String getCuisine() {
        return "Chinese";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMenu(String restaurant_id) {
        // Here we request to fetch menu for the specific restaurant from database in real world system
        return "Menu";
    }
}
