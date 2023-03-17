import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private String type = "water";

    List<String> attacks = Arrays.asList("raindance", "surf", "hydrocanon", "hydropump");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    List<String> getAttacks() {
        return attacks;
    }

    void rainDance(Pokemon name, Pokemon enemy);
    void surf(Pokemon name, Pokemon enemy);
    void hydroCanon(Pokemon name, Pokemon enemy);
    void hydroPump(Pokemon name, Pokemon enemy);




}
