package locations;

import monsters.Monster;

import java.util.Map;

public class SpiderForest extends Location {
    public SpiderForest(String name, Map<Integer, Monster> monsterMap, Integer addToMonsterHp, Integer addToCharacterHp, Integer getAddToMonsterPower, Integer getAddToCharacterPower) {
        super(name, monsterMap, addToMonsterHp, addToCharacterHp, getAddToMonsterPower, getAddToCharacterPower);
    }

    public SpiderForest(String name, Map<Integer, Monster> monsterMap) {
        super(name, monsterMap);
    }

    public SpiderForest() {
    }

}
