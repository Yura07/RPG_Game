package locations;
import db.DataBaseHandler;
import heroes.Character;
import monsters.Monster;
import java.util.*;


public class Location {
    private String name;
    private Integer addToMonsterHp = 0;
    private Integer addToCharacterHp = 0;
    private Integer getAddToMonsterPower = 0;
    private Integer getAddToCharacterPower = 0;

    public Location(String name, Integer addToMonsterHp, Integer addToCharacterHp, Integer getAddToMonsterPower, Integer getAddToCharacterPower) {
        this.name = name;
        this.addToMonsterHp = addToMonsterHp;
        this.addToCharacterHp = addToCharacterHp;
        this.getAddToMonsterPower = getAddToMonsterPower;
        this.getAddToCharacterPower = getAddToCharacterPower;
    }

    public Location() {
    }

    public void dange(Character character) {
        Scanner in = new Scanner(System.in);
        DataBaseHandler dataBaseHandler = new DataBaseHandler();
        boolean isCorrectInput = true;
        List<Monster> monsters = dataBaseHandler.getAll();
        for (Monster monster : monsters) {
            addToMonster(monster);
            addToCharacter(character);
            while (monster.getHp() > 0 && character.getHp() > 0) {
                do {
                    try {
                        System.out.println("Press \n 1. for fight \n 2. for use ability \n 3. for heal");
                        switch (in.nextLine()) {
                            case "1":
                                character.fight(monster, character);
                                break;
                            case "2":
                                character.ability(monster, character);
                                break;
                            case "3":
                                character.heal(monster);
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        isCorrectInput = false;
                    } catch (InputMismatchException | NullPointerException | IllegalArgumentException e) {
                        System.err.println("Incorrect enter. Please try again");
                    }
                } while (isCorrectInput);
                if (monster.getHp() <= 0) {
                    System.out.println("Monster is dead");
                } else {
                    System.out.print("monster "+ monster.getName() + " HP:" + monster.getHp());
                }
                System.out.println("    " + character.getNickName() + " HP:" + character.getHp());
                System.out.println("============================");
            }
        }
    }

    private void addToMonster(Monster monster) {
        monster.setHp(monster.getHp() + addToMonsterHp);
        monster.setPower(monster.getPower() + getAddToMonsterPower);
    }

    private void addToCharacter(Character character) {

        character.setHp(character.getHp() + addToMonsterHp);
        character.setPower(character.getPower() + getAddToMonsterPower);
    }
}