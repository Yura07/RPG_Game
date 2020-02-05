package locations;

import monsters.Monster;

import java.util.List;
import java.util.Map;

public class DragonCave extends Location {
    public DragonCave(String name, List<Monster> monsterList, Integer addToMonsterHp, Integer addToCharacterHp, Integer getAddToMonsterPower, Integer getAddToCharacterPower) {
        super(name, monsterList, addToMonsterHp, addToCharacterHp, getAddToMonsterPower, getAddToCharacterPower);
    }

    public DragonCave(String name, List<Monster> monsterList) {
        super(name, monsterList);
    }

    public DragonCave() {
    }
}
