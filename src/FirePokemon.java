import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private String type = "fire";

    List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return type;
    }

    List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with fireLash");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 2);
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 5);
            }
            default -> {
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + " health points left");
        System.out.println(name.getName() + " still has " + name.getHp() + " health points.");
    };
    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flameThrower");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 2);
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 5);
            }
            default -> {
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + " health points left");
        System.out.println(name.getName() + " still has " + name.getHp() + " health points.");
    };
    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 2);
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 5);
            }
            default -> {
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + " health points left");
        System.out.println(name.getName() + " still has " + name.getHp() + " health points.");
    };
    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 2);
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 5);
            }
            default -> {
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + " health points left");
        System.out.println(name.getName() + " still has " + name.getHp() + " health points.");
    };




}
