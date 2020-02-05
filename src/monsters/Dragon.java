package monsters;

import heroes.Character;

public class Dragon extends Monster {
    public Dragon(Integer id, Integer classId, String name, Integer hp, Integer power) {
        super(id, classId, name, hp, power);
    }

    public Dragon() {
    }

    @Override
    public Integer useAttackSpell() {
        Integer power = null;
        if (super.getHp() < 75 && super.getHp() > 55 || super.getHp() < 35 && super.getHp() > 15) {
            power = super.getPower();
            double dmg = power * 3;
            power = (int) dmg;
            System.out.println("I used power");
        }
        return power;
    }

    @Override
    public void monsterShot(Character character) {
        character.setHp(character.getHp() - super.getPower() * 2);
    }
}