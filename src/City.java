public class City {
    private String name = "";
    private int population = 0;

    public void setName(String name) {
        if (name.length() > 3 && name.length() < 20) {
            this.name = name;
        }
    }

    public void setPopulation(int population) {
        if (population > 100000) {
            this.population = population;
        }
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}
