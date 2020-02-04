package heroes;

import monsters.Monster;

public class Fighter extends Character {
    public Fighter(String nickName, String classId, Integer hp, boolean isMale, Integer power) {
        super(nickName, classId, hp, isMale, power);
    }

    @Override
    public void characterShot(Monster monster) {
        monster.setHealth(monster.getHealth()- super.getPower());
    }

    @Override
    public void ability(Monster monster, Character character) {
        monster.monsterShot(character);
        monster.setHealth(monster.getHealth()-super.getPower()*2);
    }

    @Override
    public void heal(Monster monster) {
        setHp(super.getHp() + 20);
    }
}
