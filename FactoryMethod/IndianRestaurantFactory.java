public class IndianRestaurantFactory implements RestaurantFactory {
    @Override
    public Restaurant createRestaurant(String name) {
        return new IndianRestaurant(name);
    }
}
