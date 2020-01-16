package heroes;

import monsters.Monster;

public class Mag extends Character {
    public Mag(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Mag() {
    }

    @Override
    public void characterShot(Monster monster) {

    }

    @Override
    public void heal(Monster monster) {
        Integer magHealth = super.getHealth();
        super.setHealth(magHealth += 50);
    }

    @Override
    public void ability(Monster monster, Character character) {
        monster.monsterShot(character);
        monster.setHealth(monster.getHealth()-super.getPower()*3);
    }
}
