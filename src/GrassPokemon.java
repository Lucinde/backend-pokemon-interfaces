import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private String type = "grass";

    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leachseed", "leaveblade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }



    List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy);
    public void solarBeam(Pokemon name, Pokemon enemy);
    public void leechSeed(Pokemon name, Pokemon enemy);
    public void leaveBlade(Pokemon name, Pokemon enemy);


}