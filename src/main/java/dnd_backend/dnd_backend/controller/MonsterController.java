package dnd_backend.dnd_backend.controller;


import dnd_backend.dnd_backend.model.Item;
import dnd_backend.dnd_backend.model.Monster;
import dnd_backend.dnd_backend.service.dao.ItemDao;
import dnd_backend.dnd_backend.service.dao.MonsterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MonsterController {

    @Autowired
    @Qualifier("MonsterService")
    private MonsterDao MonsterDao;


    @GetMapping("/Monsters")
    public List<Monster> Monsters() {
        return MonsterDao.Monsters();
    }

   // @GetMapping("/monster/name")
    //public List<Monster> MonsterId() {
     //   return
    //}



}
