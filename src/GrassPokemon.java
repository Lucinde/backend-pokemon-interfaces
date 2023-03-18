import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private String type = "grass";

    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leachseed", "leaveblade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return type;
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafStorm");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 5);
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 20);
            }
            default -> {
                enemy.setHp(enemy.getHp() - 2);
            }
        }
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + " health points left");
        System.out.println(name.getName() + " still has " + name.getHp() + " health points.");
    };
    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarBeam");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 5);
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 20);
            }
            default -> {
                enemy.setHp(enemy.getHp() - 2);
            }
        }
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + " health points left");
        System.out.println(name.getName() + " still has " + name.getHp() + " health points.");
    };
    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechSeed");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 5);
                name.setHp(name.getHp() + 5);
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 20);
                name.setHp(name.getHp() + 20);
            }
            default -> {
                enemy.setHp(enemy.getHp() - 2);
                name.setHp(name.getHp() + 2);
            }
        }
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + " health points left");
        System.out.println(name.getName() + " still has " + name.getHp() + " health points.");
    };
    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveBlade");
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 5);
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 20);
            }
            default -> {
                enemy.setHp(enemy.getHp() - 2);
            }
        }
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + " health points left");
        System.out.println(name.getName() + " still has " + name.getHp() + " health points.");
    };


}
