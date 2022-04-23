package kg.geektech.game.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        Random random = new Random();
        int warriorCriticalDamage = random.nextInt(2) + 2;
        setDamage(getDamage() * warriorCriticalDamage);
        System.out.println("---");
        System.out.println("Warrior crit coef: " + warriorCriticalDamage);
        System.out.println("Warrior critical damage: " + getDamage());
    }
}
