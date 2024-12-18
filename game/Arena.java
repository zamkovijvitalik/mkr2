package game;
import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character);
    }

    public void moveCharacter(Character character, int x, int y) {
        character.move(x, y);
        character.updateVisibility();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(Character character) {
        for (Observer observer : observers) {
            observer.update(character);
        }
    }
}