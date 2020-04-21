package dnd_backend.dnd_backend.controller;

import dnd_backend.dnd_backend.model.Item;
import dnd_backend.dnd_backend.service.dao.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CharacterBuilderController {

    @Autowired
    @Qualifier("itemService")
    private ItemDao itemDao;

    @GetMapping("/item/list")
    public List<Item> items() {
        return itemDao.getItems();
    }


}
