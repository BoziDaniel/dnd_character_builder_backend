package dnd_backend.dnd_backend.model;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Item, Integer> inventory = new HashMap<>();

    public Inventory() {
    }

    public Map<Item, Integer> getInventory() {
        return inventory;
    }

    public void addItemToInventory(Item item, Integer amount){
        inventory.put(item, amount);
    }


}
