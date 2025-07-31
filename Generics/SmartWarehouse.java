package Generics;


import java.util.*;

// === Abstract Base Class ===
abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getCategory();
}

// === Subclasses of WarehouseItem ===
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}

// === Generic Storage Class ===
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

// === Utility Class ===
class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println("Item: " + item.getName() + " | Category: " + item.getCategory());
        }
    }
}

// === Main Class ===
public class SmartWarehouse {
    public static void main(String[] args) {
        // Create Storages
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceryStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        //  dummy data
        electronicsStorage.addItem(new Electronics("Smartphone"));
        electronicsStorage.addItem(new Electronics("Laptop"));

        groceryStorage.addItem(new Groceries("Milk"));
        groceryStorage.addItem(new Groceries("Apples"));

        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Desk"));

        // Display all
        System.out.println("=== Electronics ===");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\n=== Groceries ===");
        WarehouseUtils.displayItems(groceryStorage.getItems());

        System.out.println("\n=== Furniture ===");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
