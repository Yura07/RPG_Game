package monsters;

import heroes.Character;

public class Dragon extends Monster {
    public Dragon(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Dragon() {
    }

    @Override
    public void monsterShot(Character character) {
        character.setHealth(character.getHealth() - super.getPower() * 2);
    }

    public void dragonFire(Character character) {
        if (super.getHealth() < 75 && super.getHealth() > 55 || super.getHealth() < 35 && super.getHealth() > 15) {
            character.setHealth(character.getHealth() - super.getPower() * 3);
        }
    }
}
