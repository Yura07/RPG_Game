package levels;

import heroes.Character;
import locations.Location;
import locations.SpiderForest;
import monsters.Monster;
import monsters.Spider;

import java.util.HashMap;
import java.util.Map;

public class Level1 {
    public Level1() {
    }

    public void level1(Character character) {
        levelInfo();
        Monster monsterLvl1 = new Spider("Spider", 20, 2);
        Monster monsterLvl2 = new Spider("Spider", 30, 4);
        Monster monsterLvl3 = new Spider("Spider", 40, 8);
        Monster boss = new Spider("Big Spider", 50, 12);

        Map<Integer, Monster> locationMonsters = new HashMap<>();
        locationMonsters.put(1, monsterLvl1);
        locationMonsters.put(2, monsterLvl2);
        locationMonsters.put(3, monsterLvl3);
        locationMonsters.put(4, boss);

        Location spiderForest = new SpiderForest("Spider forest", locationMonsters);
        spiderForest.dange(character);
    }

    private void levelInfo(){
        System.out.println("You are in terible Spider Forest. If you want to pass this forest you have to " +
                           "kill 3 spiders and 1 big spider.Good luck");
    }
}
