package com.map.it;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class HMap8Compute_IfAbsent_IfPresentEX {
    public static void main(String[] args) {
        // Create an inventory map
        Map<String, Integer> inventory = new HashMap<>();
        
        // Initialize the inventory
        inventory.put("Apples", 10);
        inventory.put("Bananas", 5);
        inventory.put("Oranges", 8);

        // Example 1: Using computeIfAbsent
        inventory.computeIfAbsent("Grapes", key -> 0); // Initialize count to 0 if not present
        inventory.computeIfAbsent("Apples", key -> 0); // No change, "Apples" already present
        
        // Example 2: Using computeIfPresent with null check
        String itemToUpdate = "Bananas";
        if (inventory.containsKey(itemToUpdate)) {
            inventory.computeIfPresent(itemToUpdate, (key, value) -> value + 3); // Add 3 more Bananas
        } else {
            System.out.println(itemToUpdate + " not found in inventory.");
        }
        
        // Example 3: Using compute with null check
        String itemToReduce = "Oranges";
        if (inventory.containsKey(itemToReduce)) {
            inventory.compute(itemToReduce, (key, value) -> value - 5); // Reduce Orange count by 5
        } else {
            System.out.println(itemToReduce + " not found in inventory.");
        }
        
        // Display the updated inventory
        System.out.println("Inventory:");
        inventory.forEach((item, count) -> System.out.println(item + ": " + count));
    }
}
