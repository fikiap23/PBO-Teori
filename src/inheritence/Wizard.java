package inheritence;

class Wizard extends Character {
    int mp;

    public Wizard(String name, int level, int mp) {
        super(name, level);
        this.mp = mp;
    }

    public void attack() {
        System.out.println("Wizard attacks with magic!");
    }

    public void castSpell() {
        System.out.println("Wizard casts a spell!");
    }
}
