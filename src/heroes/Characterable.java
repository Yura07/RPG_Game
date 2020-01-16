package heroes;

import monsters.Monster;

public interface Characterable {
    void fight(Monster monster, Character character);
    void characterShot(Monster monster);
    void ability(Monster monster, Character character);
    void heal(Monster monster);
}
