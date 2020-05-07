package dnd_backend.dnd_backend.service.dao.implementation;

import dnd_backend.dnd_backend.model.character.Character;
import dnd_backend.dnd_backend.service.dao.CharacterDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("characterService")
public class CharacterDaoMem implements CharacterDao {

    private List<Character> characters = new ArrayList<>();

    public CharacterDaoMem() {
        characters.add(new Character("1","Skandar Graun", "warrior-priest", 1, "https://skandargraun.eoldal.hu/img/picture/2/skandar2.jpg"));
        characters.add(new Character("2","Peltar", "wizard", 10, "https://i.pinimg.com/originals/95/ff/34/95ff3439cd8f575ae1807b1482514db3.jpg"));
    }


    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    @Override
    public Character addCharacter(Character character) {
        this.characters.add(character);
        return character;
    }
}
