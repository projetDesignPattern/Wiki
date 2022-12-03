import java.util.ArrayList;
import java.util.List;

public class Area {

    private static final List<Pokemon>  pokemons;

    static{
        pokemons = new ArrayList<>();
    }

    public Area(PokemonAbstractFactory factory, String PokemonName){
        pokemons.add(factory.create(PokemonName));
    }

    public Area(PokemonAbstractFactory factory, List<String> PokemonNames){
        pokemons.addAll(factory.create(PokemonNames));
    }


    public String getPokemonsInArea(){
        StringBuilder sb = new StringBuilder();
        Area.pokemons.forEach(value -> sb.append(value.getName()));
        return sb.toString();
    }


}