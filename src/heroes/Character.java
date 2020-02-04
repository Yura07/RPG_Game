package heroes;

import monsters.Monster;

public class Character implements Characterable {
    private String nickName;
    private String className;
    private Integer hp;
    private boolean isMale;
    private Integer power;

    public Character(String nickName, String className, Integer hp, boolean isMale, Integer power) {
        this.nickName = nickName;
        this.className = className;
        this.hp = hp;
        this.isMale = isMale;
        this.power = power;
    }

//    public Character() {
//    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassId(Integer classId) {
        this.className = className;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public void fight(Monster monster, Character character){
        monster.monsterShot(character);
        character.characterShot(monster);
    }

    @Override
    public void characterShot(Monster monster) {

    }

    @Override
    public void ability(Monster monster, Character character) {

    }

    @Override
    public void heal(Monster monster) {

    }
}
