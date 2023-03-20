import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private String type = "water";

    List<String> attacks = Arrays.asList("raindance", "surf", "hydrocanon", "hydropump");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return type;
    }

    List<String> getAttacks() {
        return attacks;
    }

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with rainDance");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 2);
            }
            case "electric" -> {
                System.out.println("has no effect on " + enemy.getName());
            }
            default -> {
                enemy.setHp(enemy.getHp() + 5);
            }
        }
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + " health points left");
        System.out.println(name.getName() + " still has " + name.getHp() + " health points.");
    }
    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
        attackPoints(name, enemy);
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroCanon");
        attackPoints(name, enemy);
    }
    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroPump");
        attackPoints(name, enemy);
    }

    private void attackPoints(Pokemon name, Pokemon enemy) {
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 2);
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 10);
            }
            default -> {
                enemy.setHp(enemy.getHp() - 5);
            }
        }
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + " health points left");
        System.out.println(name.getName() + " still has " + name.getHp() + " health points.");
    }

}
