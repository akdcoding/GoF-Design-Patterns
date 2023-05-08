import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestaurantListFactory {
    public static List<Restaurant> getRestaurantList(RestaurantFactory factory, List<String> names) {      
        List<Restaurant> restaurants = new ArrayList<>();
        for (String name : names) {
            restaurants.add(factory.createRestaurant(name));
        }
        return restaurants;
    }


    public static List<Restaurant> getIndianRestaurantList(String cuisine, List<String> names) {
        RestaurantFactory factory;
        factory = new IndianRestaurantFactory();
        return getRestaurantList(factory, names);
    }

    public static List<Restaurant> getChineseRestaurantList(String cuisine, List<String> names) {
        RestaurantFactory factory;
        factory = new ChineseRestaurantFactory();
        return getRestaurantList(factory, names);
    }

    public static List<Restaurant> getThaiRestaurantList(String cuisine, List<String> names) {
        RestaurantFactory factory;
        factory = new ThaiRestaurantFactory();
        return getRestaurantList(factory, names);
    }

    public static void main(String[] args){
        List<String> indianNames = Arrays.asList("Flamin Curry", "Kamal Palace", "Flavor of Punjab", "Himalayan Grill");
        List<Restaurant> indianRestaurants = RestaurantListFactory.getIndianRestaurantList("Indian", indianNames);

        List<String> chineseNames = Arrays.asList("Panda Express", "JJ Chinese Express", "Asian Chef");
        List<Restaurant> chineseRestaurants = RestaurantListFactory.getChineseRestaurantList("Chinese", chineseNames);

        List<String> thaiNames = Arrays.asList("Hiccups", "Pad Thai Classic", "Elephant Thai Kitchen");
        List<Restaurant> thaiRestaurants = RestaurantListFactory.getThaiRestaurantList("Thai", thaiNames);

        System.out.println("Indian Restaurants");
        for (Restaurant item : indianRestaurants) {
        System.out.println(item.getName() + " - " + item.getCuisine());
        }

        System.out.println("----------------------------");
        System.out.println("Chinese Restaurants");
        for (Restaurant item : chineseRestaurants) {
            System.out.println(item.getName()+" - "+item.getCuisine());
        }

        System.out.println("----------------------------");
        System.out.println("Thai Restaurants");
        for (Restaurant item : thaiRestaurants) {
            System.out.println(item.getName()+" - "+item.getCuisine());
        }
    }
}
