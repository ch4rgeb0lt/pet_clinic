public class Parrot extends Pet {
    private String feathers;

    public Parrot (int id, int age, String name, String species, double weight, boolean health, String feathers) {
        super(id, age, name, species, weight, health);
        this.feathers = feathers;
    }

    public void speak() {
        System.out.println("trrr");
    }

    public double acepromazine() {
        double dosage = (getWeight() / 2.20462) * (0.001 / 10);
        return (double) (Math.round(dosage * 100000)) / 100000;
    }

    public double carprofen() {
        double dosage = (getWeight() / 2.20462) * (0.15 / 12);
        return (double) (Math.round(dosage * 1000)) / 1000;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }
}
