package dnd_backend.dnd_backend.model.character;

import dnd_backend.dnd_backend.model.Item;

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
