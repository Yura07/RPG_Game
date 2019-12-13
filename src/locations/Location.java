package locations;

import heroes.Character;
import monsters.Monster;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Location {
    private String name;
    private Map<Integer , Monster> monsterMap = new HashMap<>();
    private Integer addToMonsterHp = 0;
    private Integer addToCharacterHp = 0;
    private Integer getAddToMonsterPower = 0;
    private Integer getAddToCharacterPower = 0;

    public Location(String name, Map<Integer, Monster> monsterMap, Integer addToMonsterHp, Integer addToCharacterHp, Integer getAddToMonsterPower, Integer getAddToCharacterPower) {
        this.name = name;
        this.monsterMap = monsterMap;
        this.addToMonsterHp = addToMonsterHp;
        this.addToCharacterHp = addToCharacterHp;
        this.getAddToMonsterPower = getAddToMonsterPower;
        this.getAddToCharacterPower = getAddToCharacterPower;
    }

    public Location(String name, Map<Integer, Monster> monsterMap) {
        this.name = name;
        this.monsterMap = monsterMap;
    }

    public Location() {
    }

    public void dange(Character character){
        Scanner in = new Scanner(System.in);
        Set<Integer> integers = this.monsterMap.keySet();
        for (Integer lvl : integers) {
            Monster monster = this.monsterMap.get(lvl);
            addToMonster(monster);
            addToCharacter(character);
            while (monster.getHealth() > 0 && character.getHealth() > 0){
                System.out.println("Press one for fight of two for heal");
                switch (in.nextInt()){
                    case 1:{
                        character.fight(monster,character);
                        break;
                    }
                    case 2: {
                        character.heal(monster);
                        break;
                    }
                }
                System.out.print("monster HP:" + monster.getHealth());
                System.out.println("  character HP:" + character.getHealth());
            }
        }
    }

    private void addToMonster(Monster monster){
        monster.setHealth(monster.getHealth() + addToMonsterHp);
        monster.setPower(monster.getPower() + getAddToMonsterPower);
    }

    private void addToCharacter(Character character){

        character.setHealth(character.getHealth() + addToMonsterHp);
        character.setPower(character.getPower() + getAddToMonsterPower);

    }
}
