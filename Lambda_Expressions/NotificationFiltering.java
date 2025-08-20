
package com.example.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Scenario:
 * A hospital app sends patient alerts. Based on user preference,
 * only certain alerts should be shown.
 * Use lambdas with Predicate to filter alerts.
 */
public class NotificationFiltering {

    enum Severity { LOW, MEDIUM, HIGH, CRITICAL }

    static class Alert {
        final String patientId;
        final String message;
        final Severity severity;
        final boolean acknowledged;

        Alert(String patientId, String message, Severity severity, boolean acknowledged) {
            this.patientId = patientId;
            this.message = message;
            this.severity = severity;
            this.acknowledged = acknowledged;
        }

        @Override
        public String toString() {
            return String.format("[%s] Patient %s → %s (ack=%s)", severity, patientId, message, acknowledged);
        }
    }

    static List<Alert> filter(List<Alert> alerts, Predicate<Alert> rule) {
        return alerts.stream().filter(rule).collect(Collectors.toList());
    }

    public static void runDemo() {
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("P001", "Vitals stable", Severity.LOW, true));
        alerts.add(new Alert("P002", "High temperature", Severity.MEDIUM, false));
        alerts.add(new Alert("P003", "Oxygen dropping", Severity.HIGH, false));
        alerts.add(new Alert("P004", "Cardiac arrest!", Severity.CRITICAL, false));
        alerts.add(new Alert("P005", "BP elevated", Severity.MEDIUM, true));

        // Preferences using Predicates (lambdas)
        Predicate<Alert> onlyUnack = a -> !a.acknowledged;
        Predicate<Alert> highOrAbove = a -> a.severity == Severity.HIGH || a.severity == Severity.CRITICAL;
        Predicate<Alert> patientFilter = a -> a.patientId.startsWith("P00");

        // Combine: unacknowledged AND high-or-above AND patient filter
        Predicate<Alert> userRule = onlyUnack.and(highOrAbove).and(patientFilter);

        List<Alert> visible = filter(alerts, userRule);
        visible.forEach(a -> System.out.println("[Visible] " + a));
    }
}
