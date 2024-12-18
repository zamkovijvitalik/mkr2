package game;

public class Mage implements Character {
    private String name = "Mage";
    private int health = 100;
    private int attackPower = 40;
    private int x, y;

    public Mage(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a spell with power: " + attackPower);
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