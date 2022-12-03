public class Capacite {

    private final int degat;
    private final String name;



    public Capacite(int degat, String name) {
        this.degat = degat;
        this.name = name;
    }

    public int getDegat() {
        return degat;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Capacite{" +
                "degat=" + degat +
                ", name='" + name + '\'' +
                '}';
    }
}
