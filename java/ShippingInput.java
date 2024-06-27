import java.util.List;

public class ShippingInput {

    List<String> items; // ["wolf", "goat", "cabbage"]
    List<FoodChain> foodChain; // [{"predator": "wolf", "prey": "goat"}, {"predator": "goat", "prey": "cabbage"}]

    static class FoodChain {
        String predator;
        String prey;

        FoodChain(String predator, String prey) {
            this.predator = predator;
            this.prey = prey;
        }
    }
}
