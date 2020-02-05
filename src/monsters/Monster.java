package monsters;

import heroes.Character;

public class Monster implements Monsterable {
    private Integer id;
    private Integer classId;
    private String name;
    private Integer hp;
    private Integer power;

    public Monster(Integer id, Integer classId, String name, Integer hp, Integer power) {
        this.id = id;
        this.classId = classId;
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public Monster() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public Integer useAttackSpell() {
        return null;
    }

    @Override
    public void monsterShot(Character character) {
    }
}