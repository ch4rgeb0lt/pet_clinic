public class Turtle extends Pet {
    private String type;

    public Turtle (int id, int age, String name, String species, double weight, boolean health, String type) {
        super(id, age, name, species, weight, health);
        this.type = type;
    }

    public void speak() {
        System.out.println("...");
    }

    public double acepromazine() {
        double dosage = (getWeight() / 2.20462) * (0.007 / 10);
        return (double) (Math.round(dosage * 100000)) / 100000;
    }

    public double carprofen() {
        double dosage = (getWeight() / 2.20462) * (0.45 / 12);
        return (double) (Math.round(dosage * 1000)) / 1000;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
