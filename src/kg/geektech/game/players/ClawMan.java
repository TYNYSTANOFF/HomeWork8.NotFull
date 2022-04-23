package kg.geektech.game.players;

import java.util.Random;

public class ClawMan extends Hero {
    private int clawLength = 4;
    public ClawMan(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BLEEDING);
    }


    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        Random random = new Random();
        int bleedingChance = random.nextInt();
    }
}
