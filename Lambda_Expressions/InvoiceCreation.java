
package com.example.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Scenario:
 * Generate invoice objects from transaction IDs using a constructor reference.
 */
public class InvoiceCreation {

    static class Invoice {
        final String txnId;
        Invoice(String txnId) { this.txnId = txnId; }
        @Override public String toString() { return "Invoice{txnId='" + txnId + "'}"; }
    }

    public static void runDemo() {
        List<String> txnIds = Arrays.asList("TXN-1001", "TXN-1002", "TXN-1003");

        // Constructor reference instead of lambda: id -> new Invoice(id)
        Function<String, Invoice> toInvoice = Invoice::new;

        List<Invoice> invoices = txnIds.stream()
                .map(toInvoice)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
