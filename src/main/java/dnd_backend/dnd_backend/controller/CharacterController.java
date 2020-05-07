package dnd_backend.dnd_backend.controller;

import dnd_backend.dnd_backend.model.Item;
import dnd_backend.dnd_backend.model.character.Character;
import dnd_backend.dnd_backend.service.dao.CharacterDao;
import dnd_backend.dnd_backend.service.dao.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CharacterController {
    @Autowired
    @Qualifier("characterService")
    private CharacterDao characterDao;

    @GetMapping("/characters")
    public List<Character> getAllCharacters() {
        System.out.println("get request happened /characters");
        return characterDao.getCharacters();
    }

    @PostMapping("/add-new-character")
    public Character addACharacter(@RequestBody Character character) {
        characterDao.addCharacter(character);
        System.out.println("post request happened /add-new-character");

        System.out.println(character.toString());
        System.out.println(characterDao.getCharacters().toString());
        return character;

    }
}
