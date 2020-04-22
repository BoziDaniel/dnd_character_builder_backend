package dnd_backend.dnd_backend.model;

import java.util.Map;

public class Character {
    private String id;
    private String name;
    private String clas;
    private int characterLvl;
    private String img;
    private Map<String, Integer> stats;
    private Map<String, Integer> skills;
    private Inventory inventory;
    private int skillPoints;
    private int statPoints;

    public Character(String id, String name, String clas, int characterLvl, String img, Map<String, Integer> stats, Map<String, Integer> skills, Inventory inventory, int skillPoints, int statPoints) {
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

    public Map<String, Integer> getStats() {
        return stats;
    }

    public void setStats(Map<String, Integer> stats) {
        this.stats = stats;
    }

    public Map<String, Integer> getSkills() {
        return skills;
    }

    public void setSkills(Map<String, Integer> skills) {
        this.skills = skills;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
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
}
