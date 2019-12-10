package heroes;

import monsters.Monster;

import java.util.Random;

public class Bowman extends Character {

    public Bowman(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Bowman() {
    }


    public void bowShot(Monster monster){
        Integer monsterHealth = monster.getHealth();
        Integer power = super.getPower();
        double bowShot = power * 1.6;
        power = (int) bowShot;
        monsterHealth -=power;
        monster.setHealth(monsterHealth);
    }

    public void disguise(Monster monster){
        Integer monsterHealth = monster.getHealth();
        Integer power = super.getPower();
        double shot = power * 1.3;
        power = (int) shot;
        monsterHealth -=power;
        monster.setHealth(monsterHealth);
    }
}
