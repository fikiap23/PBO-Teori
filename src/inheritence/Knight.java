package inheritence;

// subclass Knight
class Knight extends Character {
    int attack;

    public Knight(String name, int level, int attack) {
        super(name, level);
        this.attack = attack;
    }

    public void attack() {
        System.out.println("Knight attacks with " + attack + " attack points!");
    }
}