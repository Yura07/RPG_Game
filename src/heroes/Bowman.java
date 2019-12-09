package heroes;

import monsters.Monster;

import java.util.Random;

public class Bowman extends Character {

    public Bowman(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Bowman() {
    }

    public void shot(Monster monster){
        Random random = new Random();
        int randomInt = random.nextInt(100);
        Integer spellPower = null;
        if(randomInt<16){
            spellPower = monster.useAttackSpell();
        }
        Integer monsterPower = monster.getPower();
        if (spellPower != null){
            monsterPower = spellPower;
        }
        Integer bowmanHealth = super.getHealth();
        bowmanHealth -= monsterPower;
        Integer monsterHealth = monster.getHealth();
        Integer power = super.getPower();
        double shot = power * 1.6;
        power = (int) shot;
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
