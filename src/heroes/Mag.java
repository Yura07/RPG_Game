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
        magHealth += 50;
    }

    @Override
    public void fight(Monster monster) {
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
        Integer magHeath = super.getHealth();
        magHeath -= monsterPower;
        Integer monsterHealth = monster.getHealth();
        Integer magPower = super.getPower();
        double power = magPower * 0.7;
        magPower = (int) power;
        monsterHealth -= magPower;
        monster.setHealth(monsterHealth);
    }

    public void magFight(Monster monster){
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
        Integer magHeath = super.getHealth();
        magHeath -= monsterPower;
        Integer monsterHealth = monster.getHealth();
        Integer magPower = super.getPower()*3;
        monsterHealth -= magPower;
        monster.setHealth(monsterHealth);
    }
}
