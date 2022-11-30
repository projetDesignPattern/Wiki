import java.util.Optional;

public class EvolutionParEchange implements EvolutionPokemonStrategy {


    private Dresseur dresseur;

    public EvolutionParEchange(Dresseur dresseur) {
        this.dresseur = dresseur;
    }

    @Override
    public Optional<Pokemon> evolue(Pokemon p) {
        if(!(dresseur.getTeam().isEmpty())){
            dresseur.addPokemon(p.getEvolueEn());
            return Optional.of(dresseur.getEchange());
        }
        return Optional.empty();
    }
}
