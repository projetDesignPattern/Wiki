import java.util.List;

public interface PokemonAbstractFactory {


    public Pokemon create(String name);
    public List <Pokemon> create(List<String> names);
}
