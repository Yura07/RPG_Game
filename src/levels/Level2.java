package levels;

import heroes.Character;
import locations.DragonCave;
import locations.Location;
import locations.SpiderForest;
import monsters.Dragon;
import monsters.Monster;
import monsters.Spider;

import java.util.HashMap;
import java.util.Map;

public class Level2 {
    public Level2(){

    }
    public void level2(Character character){
        levelInfo();
        Monster monsterLvl1 = new Dragon("Dragon", 20, 2);
        Monster monsterLvl2 = new Dragon("Dragon", 30, 4);
        Monster monsterLvl3 = new Dragon("Dragon", 40, 8);
        Monster boss = new Dragon("Big Dragon", 50, 12);

        Map<Integer, Monster> locationMonsters = new HashMap<>();
        locationMonsters.put(1, monsterLvl1);
        locationMonsters.put(2, monsterLvl2);
        locationMonsters.put(3, monsterLvl3);
        locationMonsters.put(4, boss);

        Location dragonCave = new DragonCave("Dragon Cave", locationMonsters);
        dragonCave.dange(character);
    }

    private void levelInfo(){
        System.out.println("You are in gloomy Dragon Cave. If you want to pass this cave you have to " +
                "kill 3 dragons and 1 big dragon.Good luck");
    }
}
