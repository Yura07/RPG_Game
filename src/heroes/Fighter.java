package heroes;

import monsters.Monster;

import java.util.Random;

public class Fighter extends Character {
    public Fighter(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Fighter() {
    }

    @Override
    public void ability(Monster monster, Character character) {
        monster.monsterShot(character);
        monster.setHealth(monster.getHealth()-super.getPower()*2);
    }
}
