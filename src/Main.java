import heroes.Bowman;
import heroes.Character;
import heroes.Fighter;
import monsters.Dragon;
import monsters.Monster;
import monsters.Spider;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//
//        Character character = new Bowman("Test" , 100 , 16);
//        Monster monsterLvl1 = new Dragon("Test", 20, 2);
//        Monster monsterLvl2 = new Dragon("Test" , 30 , 4);
//        Monster monsterLvl3 = new Dragon("Test" , 40 , 8);
//        Monster boss = new Dragon("Test" , 50 , 12);
//
//        Map<Integer , Monster> locationMonsters = new HashMap<>();
//        locationMonsters.put(1 , monsterLvl1);
//        locationMonsters.put(2 , monsterLvl2);
//        locationMonsters.put(3 , monsterLvl3);
//        locationMonsters.put(4 , boss);
//
//        locations.Location spiderForest = new locations.Location("Spider forest" , locationMonsters);
//        spiderForest.dange(character);
        new MyMenu();
    }

}