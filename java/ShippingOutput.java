import java.util.List;

public class ShippingOutput {
    List<Step> steps; // [{"action": "transport", "item": "goat"}, {"action": "return"}, ...]

    static class Step {
        String action; // "transport" or "return"
        String item;   // "wolf", "goat", or "cabbage"

        Step(String action, String item) {
            this.action = action;
            this.item = item;
        }
    }
}
