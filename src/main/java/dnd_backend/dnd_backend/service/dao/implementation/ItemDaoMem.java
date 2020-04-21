package dnd_backend.dnd_backend.service.dao.implementation;
import dnd_backend.dnd_backend.model.Item;
import dnd_backend.dnd_backend.service.dao.ItemDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("itemService")
public class ItemDaoMem implements ItemDao {

    private List<Item> items = new ArrayList<>();


    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public void setItems(List<Item> newItems) {
        items = newItems;
    }

}
