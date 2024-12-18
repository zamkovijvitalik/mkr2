package game;

public class Archer implements Character {
    private String name = "Archer";
    private int health = 120;
    private int attackPower = 30;
    private int x, y;

    public Archer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots an arrow with power: " + attackPower);
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
