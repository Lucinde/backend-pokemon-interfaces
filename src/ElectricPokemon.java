import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private String type = "electric";

    List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    List<String> getAttacks() {
        return attacks;
    }

    @Override
    public String getType() {
        return type;
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderPunch");
        attackPoints(name, enemy);
    }
    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroBall");
        attackPoints(name, enemy);
    }
    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
        name.setHp(name.getHp() + 10);
        attackPoints(name, enemy);
    }
    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with voltTackle");
        attackPoints(name, enemy);
    }

    private void attackPoints(Pokemon name, Pokemon enemy) {
        String enemyType = enemy.getType();
        switch (enemyType) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 5);
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 2);
            }
            default -> {
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has now " + enemy.getHp() + " health points left");
        System.out.println(name.getName() + " still has " + name.getHp() + " health points.");
    }

}
