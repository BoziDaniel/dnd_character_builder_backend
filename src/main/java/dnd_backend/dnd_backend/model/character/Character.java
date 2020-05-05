package dnd_backend.dnd_backend.model.character;

import dnd_backend.dnd_backend.model.Item;

import java.util.ArrayList;
import java.util.List;


public class Character {
    private String id;
    private String name;
    private String clas;
    private int characterLvl;
    private String img;
    private List<Stat> stats;
    private List<Skill> skills;
    private List<Item> inventory;
    private int skillPoints;
    private int statPoints;

    public Character(String name) {
        this.name = name;
    }

    public Character(String id, String name, String clas, int characterLvl, String img, List<Stat> stats, List<Skill> skills, int skillPoints, int statPoints, List<Item> inventory) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.characterLvl = characterLvl;
        this.img = img;
        this.stats = stats;
        this.skills = skills;
        this.inventory = inventory;
        this.skillPoints = skillPoints;
        this.statPoints = statPoints;

    }

    public Character(String id, String name, String clas, int characterLvl, String img) {
        this.name = name;
        this.clas = clas;
        this.characterLvl = characterLvl;
        this.img = img;
    }

    public Character() {
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public int getCharacterLvl() {
        return characterLvl;
    }

    public void setCharacterLvl(int characterLvl) {
        this.characterLvl = characterLvl;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }


    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    public int getStatPoints() {
        return statPoints;
    }

    public void setStatPoints(int statPoints) {
        this.statPoints = statPoints;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", clas='" + clas + '\'' +
                ", characterLvl=" + characterLvl +
                ", img='" + img + '\'' +
                ", inventory=" + inventory +
                ", skillPoints=" + skillPoints +
                ", statPoints=" + statPoints +
                '}';
    }
}
