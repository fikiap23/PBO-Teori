package inheritence;

// superclass Character
class Character {
    String name;
    int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void attack() {
        System.out.println("Character attacks!");
    }

    public void defend() {
        System.out.println("Character defends!");
    }
}
