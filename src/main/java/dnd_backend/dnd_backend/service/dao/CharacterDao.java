package dnd_backend.dnd_backend.service.dao;

import dnd_backend.dnd_backend.model.Character;
import dnd_backend.dnd_backend.model.Item;

import java.util.ArrayList;
import java.util.List;

public interface CharacterDao {
    List<Character> getCharacters();

    void add(Character character);


}
