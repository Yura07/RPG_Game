package monsters;

import heroes.Character;

import java.util.Random;

public class Monster {
    private String name;
    private Integer health;
    private Integer power;

    public Monster(String name, Integer health, Integer power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public Monster() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer useAttackSpell(){

        return null;
    }


    public void monsterShot(Character character){
        Random random = new Random();
        int randomInt = random.nextInt(100);
        Integer spellPower = null;
        if(randomInt<16){
            useAttackSpell();
        }
        Integer monsterPower = this.power;
        if (spellPower != null){
            monsterPower = spellPower;
        }
        character.setHealth(character.getHealth()-monsterPower);

    }


}