public class ThaiRestaurant implements Restaurant {
    private final String name;

    public ThaiRestaurant(String name) {
        this.name = name;
    }

    @Override
    public String getCuisine() {
        return "Thai";
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
