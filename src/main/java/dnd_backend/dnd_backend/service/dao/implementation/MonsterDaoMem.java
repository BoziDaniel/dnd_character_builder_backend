package dnd_backend.dnd_backend.service.dao.implementation;

import dnd_backend.dnd_backend.model.Item;
import dnd_backend.dnd_backend.model.Monster;
import dnd_backend.dnd_backend.service.dao.MonsterDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("MonsterService")
public class MonsterDaoMem implements MonsterDao {

    private List<Monster> monsters = new ArrayList<>();



    @Override
    public List<Monster> Monsters() {
        return monsters;
    }
}
