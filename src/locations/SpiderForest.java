package locations;

import monsters.Monster;

import java.util.List;
import java.util.Map;

public class SpiderForest extends Location {
    public SpiderForest(String name, List<Monster> monsterList, Integer addToMonsterHp, Integer addToCharacterHp, Integer getAddToMonsterPower, Integer getAddToCharacterPower) {
        super(name, monsterList, addToMonsterHp, addToCharacterHp, getAddToMonsterPower, getAddToCharacterPower);
    }

    public SpiderForest(String name, List<Monster> monsterList) {
        super(name, monsterList);
    }

    public SpiderForest() {
    }

}
