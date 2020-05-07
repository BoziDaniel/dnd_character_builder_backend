package dnd_backend.dnd_backend.service.dao;

import dnd_backend.dnd_backend.model.character.Character;

import java.util.List;

public interface CharacterDao {
    List<Character> getCharacters();

    Character addCharacter(Character character);


}
