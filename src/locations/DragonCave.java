package locations;

import monsters.Monster;

import java.util.Map;

public class DragonCave extends Location {
    public DragonCave(String name, Map<Integer, Monster> monsterMap, Integer addToMonsterHp, Integer addToCharacterHp, Integer getAddToMonsterPower, Integer getAddToCharacterPower) {
        super(name, monsterMap, addToMonsterHp, addToCharacterHp, getAddToMonsterPower, getAddToCharacterPower);
    }

    public DragonCave(String name, Map<Integer, Monster> monsterMap) {
        super(name, monsterMap);
    }

    public DragonCave() {
    }
}
