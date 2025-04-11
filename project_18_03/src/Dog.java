public class Dog extends Pet {
    String breed;

    public Dog (int id, int age, String name, String species, double weight, boolean health, String breed) {
        super(id, age, name, species, weight, health);
        this.breed = breed;
    }

    public void speak() {
        System.out.println("woof");
    }

    public double acepromazine() {
        double dosage = (getWeight() / 2.20462) * (0.03 / 10);
        return (double) (Math.round(dosage * 100000)) / 100000;
    }

    public double carprofen() {
        double dosage = (getWeight() / 2.20462) * (0.5 / 12);
        return (double) (Math.round(dosage * 1000)) / 1000;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
