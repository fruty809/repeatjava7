// Main.java
public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "TELEPORT"),
                new Medic(120, 15, "HEAL", 50),
                new Warrior(150, 25, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            // Проверяем, является ли герой экземпляром класса Medic,
            // и если да, то вызываем метод increaseExperience()
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}
