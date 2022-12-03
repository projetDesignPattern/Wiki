import java.util.ArrayList;
import java.util.List;

public class PokemonFeuFactory implements PokemonAbstractFactory{


    @Override
    public Pokemon create(String name) {
        return new PokemonFeu(name);
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
