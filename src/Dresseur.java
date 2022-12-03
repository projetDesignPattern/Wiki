import java.util.List;

public class Dresseur {

    private final String name;
    private List<Pokemon> team;

    public Dresseur(String name) {
        this.name = name;
    }

    public Dresseur(String name, List<Pokemon> team) {
        this.name = name;
        this.team = team;
    }




    public List<Pokemon> getTeam() {
        return team;
    }

    public void setTeam(List<Pokemon> team) {
        this.team = team;
    }

    public void addPokemon(Pokemon p){
        team.add(p);
    }

    public Pokemon getEchange(){
        return getTeam().get(0);
    }


    @Override
    public String toString() {
        return "Dresseur{" +
                "name='" + name + '\'' +
                ", team=" + team +
                '}';
    }
}
