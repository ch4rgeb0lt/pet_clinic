public class Cat extends Pet{
    String colour;

    public Cat (int id, int age, String name, String species, double weight, boolean health, String colour) {
        super(id, age, name, species, weight, health);
        this.colour = colour;
    }

    public void speak() {
        System.out.println("meow");
    }

    public double acepromazine() {
        double dosage = (getWeight() / 2.20462) * (0.002 / 10);
        return (double) (Math.round(dosage * 100000)) / 100000;
    }

    public double carprofen() {
        double dosage = (getWeight() / 2.20462) * (0.25 / 12);
        return (double) (Math.round(dosage * 1000)) / 1000;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
