import java.util.List;
import java.util.Objects;

public class Pokemon {

    private String alias;
    private final String name;
    private List<String> capacites;
    private final int nombreEvolution;
    private int level;
    private final Pokemon evolueEn;
    private final Type type;

    public Type getType() {
        return type;
    }

    public Pokemon getEvolueEn() {
        return evolueEn;
    }

    public Pokemon(String name, int nombreEvolution, Pokemon evolueEn, Type type) {
        this.name = name;
        this.nombreEvolution = nombreEvolution;
        this.evolueEn = evolueEn;
        this.type = type;
        level = 0;
    }

    public Pokemon(String name, List<String> capacites, int nombreEvolution, Pokemon evolueEn, Type type) {
        this.name = name;
        this.capacites = capacites;
        this.nombreEvolution = nombreEvolution;
        this.evolueEn = evolueEn;
        this.type = type;
        level = 0;

    }



    public String getName() {
        return name;
    }

    public int getNombreEvolution() {
        return nombreEvolution;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) { // j'aime pas trop ca
        this.level = level;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<String> getCapacites() {
        return capacites;
    }

    public void setCapacites(List<String> capacites) {
        this.capacites = capacites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return nombreEvolution == pokemon.nombreEvolution && level == pokemon.level && Objects.equals(alias, pokemon.alias) && Objects.equals(name, pokemon.name) && Objects.equals(capacites, pokemon.capacites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, name, capacites, nombreEvolution, level);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "alias='" + alias + '\'' +
                ", name='" + name + '\'' +
                ", capacites=" + capacites +
                ", nombreEvolution=" + nombreEvolution +
                ", level=" + level +
                '}';
    }
}
