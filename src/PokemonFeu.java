import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PokemonFeu implements Pokemon {

    private final String name;
    private String alias;
    private List<Capacite> capacites;
    private int pv;
    private final int nombreEvolution; // attention si vous utilisez le constructeur par defaut votre nombreEvolution sera a 0
    private int cptEvolution;
    private final int level;
    private final String type;


    public PokemonFeu(String name) {
        this.name = name;
        level = 1;
        type="FEU";
        nombreEvolution = 0;
    }

    public PokemonFeu(String name, List<Capacite> capacites, int pv, int nombreEvolution) {
        this.name = name;
        this.capacites = capacites;
        this.pv = pv;
        this.nombreEvolution = nombreEvolution;
        this.level = 1;
        this.type = "FEU";
    }

    public PokemonFeu(String name, String alias, List<Capacite> capacites, int pv, int nombreEvolution) {
        this.name = name;
        this.alias = alias;
        this.capacites = capacites;
        this.pv = pv;
        this.nombreEvolution = nombreEvolution;
        this.level = 1;
        this.type = "FEU";
    }

    @Override
    public void attaque(Capacite capacite, Pokemon pokemon) {
        if(capacites.contains(capacite)){
            pokemon.setPv(pokemon.getPv()-capacite.getDegat());
        }

    }

    @Override
    public Pokemon prochaineEvolution() {
        return null;
    }

    @Override
    public int getPv() {
        return pv;
    }

    @Override
    public void setPv(int pv) {
        this.pv = pv;
    }

    @Override
    public List<Capacite> getCapacites() {
        return capacites;
    }

    @Override
    public void setCapacites(List<Capacite> capacites) {
        this.capacites = capacites;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getCptEvolution() {
        return cptEvolution;
    }

    public void setCptEvolution(int cptEvolution) {
        if(cptEvolution<nombreEvolution){
            this.cptEvolution = cptEvolution;
        }

    }

    @Override
    public int getNombreEvolution() {
        return nombreEvolution;
    }


    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getType() {
        return type;
    }

    public Optional<Pokemon> evolution(EvolutionPokemonStrategy e){
        return e.evolue(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonFeu that = (PokemonFeu) o;
        return nombreEvolution == that.nombreEvolution && cptEvolution == that.cptEvolution && Objects.equals(name, that.name) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nombreEvolution, cptEvolution, type);
    }
}
