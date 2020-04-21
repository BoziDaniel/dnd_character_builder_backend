package dnd_backend.dnd_backend.service.data_handling;

import dnd_backend.dnd_backend.model.Item;
import dnd_backend.dnd_backend.service.dao.ItemDao;
import dnd_backend.dnd_backend.service.data_handling.APIService.ItemAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FillUpMem {

    @Autowired
    private ItemAPIService itemApiService;

    @Autowired
    @Qualifier("itemService")
    private ItemDao itemDao;

    public void fillUpItemMem() throws IOException {
        List<Item> items = itemApiService.getAllItems();
        itemDao.setItems(items);
    }

}
