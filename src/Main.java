import java.util.function.Function;

public class Main {

    public static void main(String[] args) {


        Area a1 = new Area(new PokemonFeuFactory(),"charizard");
        System.out.println(a1.getPokemonsInArea());
    }
}
