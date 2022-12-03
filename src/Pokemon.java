import java.util.List;
import java.util.Optional;

public interface  Pokemon {
    public void attaque(Capacite capacite,Pokemon pokemon);
    public Pokemon prochaineEvolution();
    public int getPv();
    public void setPv(int pv);
    public List<Capacite> getCapacites();
    public void setCapacites(List<Capacite> capacites);
    public int getLevel();
    public String getName();
    public int getNombreEvolution();
    public Optional<Pokemon> evolution(EvolutionPokemonStrategy e);

}
