package game;

public interface Character {
    void attack();
    void move(int x, int y);
    String getName();
    int getHealth();
    int getAttackPower();
    void setCoordinates(int x, int y);
    void updateVisibility();
    void displayHealth();
}