import java.util.ArrayList;
import java.util.List;

public class PokemonEauFactory implements PokemonAbstractFactory {


    @Override
    public Pokemon create(String name) {
        return new PokemonEau(name);
    }

    @Override
    public List<Pokemon> create(List<String> names) {
        List<Pokemon> p = new ArrayList<>();
        for(String name:names){
            p.add(create(name));
        }
        return p;
    }
}
