public class ThaiRestaurantFactory implements RestaurantFactory {
    @Override
    public Restaurant createRestaurant(String name) {
        return new ThaiRestaurant(name);
    }
}
