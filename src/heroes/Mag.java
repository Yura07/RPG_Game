package heroes;

import monsters.Monster;

import java.util.Random;

public class Mag extends Character {
    public Mag(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Mag() {
    }

    @Override
    public void heal(Monster monster) {
        Integer magHealth = super.getHealth();
        super.setHealth(magHealth += 50);
    }


    public void magFight(Monster monster){
        monster.setHealth(monster.getHealth()-super.getPower()*3);
    }
}
