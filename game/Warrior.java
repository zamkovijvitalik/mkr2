package game;

public class Warrior implements Character {
    private String name = "Warrior";
    private int health = 150;
    private int attackPower = 20;
    private int x, y;

    public Warrior(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with power: " + attackPower);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(name + " moves to coordinates (" + x + ", " + y + ")");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void updateVisibility() {
    }

    @Override
    public void displayHealth() {
        System.out.println(name + "'s health: " + health);
    }
}