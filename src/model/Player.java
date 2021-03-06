package model;

public class Player {
    private int health;
    private String name;
    private int AC;
    private Weapon weapon;


    public Player() {
    }

    public Player(int health, String name, int AC, Weapon weapon) {
        this.health = health;
        this.name = name;
        this.AC = AC;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


}
