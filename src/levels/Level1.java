package levels;

import heroes.Bowman;
import heroes.Character;
import locations.Location;
import monsters.Dragon;
import monsters.Monster;
import monsters.Spider;

import java.util.HashMap;
import java.util.Map;

public class Level1{
    public Level1(){
    }
    public void level1(Character character){
    Monster monsterLvl1 = new Spider("Test", 20, 2);
    Monster monsterLvl2 = new Spider("Test" , 30 , 4);
    Monster monsterLvl3 = new Spider("Test" , 40 , 8);
    Monster boss = new Spider("Test" , 50 , 12);

    Map<Integer , Monster> locationMonsters = new HashMap<>();
        locationMonsters.put(1 , monsterLvl1);
        locationMonsters.put(2 , monsterLvl2);
        locationMonsters.put(3 , monsterLvl3);
        locationMonsters.put(4 , boss);

        Location spiderForest = new Location("Spider forest" , locationMonsters);
        spiderForest.dange(character);


    }
}