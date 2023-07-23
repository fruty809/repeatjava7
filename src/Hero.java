
public abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbility;

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }
}
