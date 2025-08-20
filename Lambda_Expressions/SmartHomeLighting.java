
package Lambda_Expressions;

import java.util.HashMap;
import java.util.Map;

/**
 * Scenario:
 * A building has smart lights. Different triggers (motion, time of day, voice
 * commands)
 * need to execute different light patterns. Use lambdas to define behaviors
 * dynamically
 * without creating multiple classes.
 */
public class SmartHomeLighting {

    // Registry of trigger -> action (Runnable chosen for simplicity)
    private final Map<String, Runnable> behaviors = new HashMap<>();

    public SmartHomeLighting register(String trigger, Runnable action) {
        behaviors.put(trigger, action);
        return this;
    }

    public void trigger(String trigger) {
        Runnable action = behaviors.get(trigger);
        if (action != null) {
            action.run();
        } else {
            System.out.println("[Lighting] No behavior registered for trigger: " + trigger);
        }
    }

    public static void runDemo() {
        SmartHomeLighting lighting = new SmartHomeLighting();

        // Define behaviors with lambdas
        lighting
                .register("motion",
                        () -> System.out.println("[Lighting] Motion detected → turn ON hallway lights for 2 minutes."))
                .register("sunset", () -> System.out.println("[Lighting] Sunset → set living room lights to warm 40%."))
                .register("voice:party",
                        () -> System.out
                                .println("[Lighting] Voice 'party mode' → cycle rainbow colors at medium speed."))
                .register("voice:relax", () -> System.out
                        .println("[Lighting] Voice 'relax' → dim bedroom lights to 20% with soft fade."));

        // Triggers
        lighting.trigger("motion");
        lighting.trigger("sunset");
        lighting.trigger("voice:party");
        lighting.trigger("unknown"); // not registered
    }
}
