package dnd_backend.dnd_backend.model.character;

public class Skill {
    private String name;
    private String index;
    private int lvl;
    private String url;

    public Skill(String name, String index, int lvl, String url) {
        this.name = name;
        this.index = index;
        this.lvl = lvl;
        this.url = url;
    }

    public Skill() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", index='" + index + '\'' +
                ", lvl=" + lvl +
                ", url='" + url + '\'' +
                '}';
    }
}
