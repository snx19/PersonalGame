public class PlayerCharacter implements Player {
    // fields
    public String name;
    public int health;
    public int strength;
    public int speed;

    // sets health
    public void setHealth(int health) {
        this.health = health;
    }
    // sets strength
    public void setStrength(int strength) {
        this.strength = strength;
    }
    // sets speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // gets health
    public int getHealth() {
        return health;
    }
    // gets strength
    public int getStrength() {
        return strength;
    }
    // gets speed
    public int getSpeed() {
        return speed;
    }




}
