package dnd_backend.dnd_backend.service.dao.implementation;

import dnd_backend.dnd_backend.model.character.Character;

import java.util.ArrayList;
import java.util.List;

public class CharacterDaoMem  {
    private List<Character> characters = new ArrayList<>();

    public CharacterDaoMem() {
    }

    public CharacterDaoMem(List<Character> characters) {
        this.characters = characters;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
