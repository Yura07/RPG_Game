package monsters;

import heroes.Character;

import java.util.Random;

public class Spider extends Monster {
    private Integer mana = 100;
    public Spider(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    @Override
    public Integer useAttackSpell() {

        this.mana -= 26;

        Integer power = super.getPower();
        double dmg = power * 1.5;
        power = (int) dmg;
        System.out.println("I used spell attack");
        return power;
    }

    @Override
    public void monsterShot(Character character) {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        Integer spellPower = null;
        if(randomInt<16){
            useAttackSpell();
        }
        Integer monsterPower = super.getPower();
        if (spellPower != null){
            monsterPower = spellPower;
        }
        character.setHp(character.getHp()-monsterPower);
    }


    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }
}