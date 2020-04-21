package dnd_backend.dnd_backend.service.dao;

import dnd_backend.dnd_backend.model.Item;

import java.util.List;


public interface ItemDao {

    List<Item> getAllItems();

    void add(Item item);

}
