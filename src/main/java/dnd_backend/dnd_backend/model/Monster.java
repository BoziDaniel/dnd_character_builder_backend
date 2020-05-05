package dnd_backend.dnd_backend.model;

public class Monster {
    private String name;
    private String size;
    private String type;
    private Integer strength;


    public Monster(String name, String size, String type, Integer strength) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }
}
