import java.util.Optional;

public class EvolutionParPierre implements EvolutionPokemonStrategy {

    private Pierre pierre;

    public EvolutionParPierre(Pierre pierre) {
        this.pierre = pierre;
    }

    @Override
    public Optional<Pokemon> evolue(Pokemon p) {
        return Optional.of(p.getEvolueEn());
    }
}
