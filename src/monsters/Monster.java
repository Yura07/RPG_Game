package monsters;

public abstract class Monster implements Monsterable {
    private String name;
    private Integer health;
    private Integer power;

    public Monster(String name, Integer health, Integer power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public Monster() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

}