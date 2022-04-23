package kg.geektech.game.players;

import java.util.Random;

public class Berserk extends Hero {

    private int savedDamage;

    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    public int getSavedDamage() {
        
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        Random random = new Random();
        int berserkBoost = random.nextInt(4) + 1;
        this.setDamage(this.getDamage() + (boss.getDamage() * berserkBoost/10));
        System.out.println("---");
        System.out.println("BerserkBoost rate: " + berserkBoost);
        System.out.println("BerserkBoosted Damage: " + getDamage());
    }
}
