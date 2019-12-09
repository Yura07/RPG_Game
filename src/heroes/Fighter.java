package heroes;

import monsters.Monster;

import java.util.Random;

public class Fighter extends Character {
    public Fighter(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Fighter() {
    }

    public void bigSwordBlow(Monster monster){
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
        Integer fighterHealth = super.getHealth();
        fighterHealth -= monsterPower;
        Integer monsterHealth = monster.getHealth();
        Integer bigSword = super.getPower()*2;
        monsterHealth -=bigSword;
        monster.setHealth(monsterHealth);
    }
}
