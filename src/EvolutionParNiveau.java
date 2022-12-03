import java.util.List;
import java.util.Optional;

public class EvolutionParNiveau implements EvolutionPokemonStrategy {

    private final List<Integer> niveauxEvolutions;

    public EvolutionParNiveau(List<Integer> niveauxEvolutions) {
        this.niveauxEvolutions = niveauxEvolutions;
    }


    @Override
    public Optional<Pokemon> evolue(Pokemon p) {
        if(p.getNombreEvolution() != 0) {

            if (p.getLevel() == niveauxEvolutions.get(0)) {
                System.out.println("Votre pokemon a evolue bravo !!");
                return Optional.of(p.prochaineEvolution());
            } else if (p.getLevel() == niveauxEvolutions.get(1)) {
                System.out.println("Votre pokemon a evolue 2 fois bravo, vous avez maitenant sa forme finale!!");
                return Optional.of(p.prochaineEvolution());
            }
        }


        return Optional.empty();

    }
}
