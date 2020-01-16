package heroes;

import monsters.Monster;

public class Fighter extends Character {
    public Fighter(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Fighter() {
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
        setHealth(super.getHealth() + 20);
    }
}
