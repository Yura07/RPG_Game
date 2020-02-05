package locations;

import monsters.Monster;

import java.util.List;
import java.util.Map;

public class SpiderForest extends Location {
    public SpiderForest(String name, Integer addToMonsterHp, Integer addToCharacterHp, Integer getAddToMonsterPower, Integer getAddToCharacterPower) {
        super(name, addToMonsterHp, addToCharacterHp, getAddToMonsterPower, getAddToCharacterPower);
    }

    public SpiderForest() {
    }

}
