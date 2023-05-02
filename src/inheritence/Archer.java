package inheritence;

// subclass Archer
class Archer extends Character {
    int speed;

    public Archer(String name, int level, int speed) {
        super(name, level);
        this.speed = speed;
    }

    public void attack() {
        System.out.println("Archer attacks with a bow and arrow!");
    }

    public void dodge() {
        System.out.println("Archer dodges the enemy's attack!");
    }
}
