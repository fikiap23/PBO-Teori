package inheritence;

// main class
public class RPGGame {
    public static void main(String[] args) {
        Knight knight = new Knight("Arthur", 10, 50);
        Wizard wizard = new Wizard("Gandalf", 12, 100);
        Archer archer = new Archer("Legolas", 8, 80);

        knight.attack();
        wizard.castSpell();
        archer.dodge();
    }
}
