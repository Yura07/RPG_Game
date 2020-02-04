package heroes;

import monsters.Monster;

public class Mag extends Character {
    public Mag(String nickName, Integer classId, Integer hp, boolean isMale, Integer power) {
        super(nickName, classId, hp, isMale, power);
    }


    @Override
    public void characterShot(Monster monster) {
        monster.setHealth(monster.getHealth()- super.getPower());
    }

    @Override
    public void heal(Monster monster) {
        Integer magHealth = super.getHp();
        super.setHp(magHealth += 40);
    }

    @Override
    public void ability(Monster monster, Character character) {
        monster.monsterShot(character);
        monster.setHealth(monster.getHealth()-super.getPower()*3);
    }
}
