public class ChineseRestaurantFactory implements RestaurantFactory {
    @Override
    public Restaurant createRestaurant(String name) {
        return new ChineseRestaurant(name);
    }
}
