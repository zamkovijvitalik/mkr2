import game.*;
import game.Character;

public class Main {
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Arena arena = new Arena();

        Observer visibilityObserver = new CharacterVisibilityObserver();
        arena.addObserver(visibilityObserver);

        Character warrior = warriorFactory.createCharacter(0, 0);
        Character mage = mageFactory.createCharacter(0, 0);
        Character archer = archerFactory.createCharacter(0, 0);

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        warrior.displayHealth();
        mage.displayHealth();
        archer.displayHealth();

        warrior.attack();
        mage.attack();
        archer.attack();

        arena.moveCharacter(warrior, 2, 3);
        arena.moveCharacter(mage, 3, 4);
        arena.moveCharacter(archer, 5, 6);
    }
}