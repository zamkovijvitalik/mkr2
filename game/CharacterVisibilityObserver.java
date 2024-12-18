package game;

public class CharacterVisibilityObserver implements Observer {
    @Override
    public void update(Character character) {
        System.out.println(character.getName() + " is now visible.");
    }
}
