import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pet {
    private int age;
    private String name;
    private String species;
    private double weight;
    private boolean health;
    private String date;
    private String attending_name;
    private String treatment;
    private double dosage;

    public Pet (int id, int age, String name, String species, double weight, boolean health) {
        this.age = age;
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.health = health;
    }

    public void speak() {
        System.out.println("*basic animal noises*");
    }

    public void other_treatment() {
    }

    public double acepromazine() {
        double dosage = (getWeight() / 2.20462) * (0.000 / 10);
        return (double) (Math.round(dosage * 100000)) / 100000;
    }

    public double carprofen() {
        double dosage = (getWeight() / 2.20462) * (0.000 / 12);
        return (double) (Math.round(dosage * 1000)) / 1000;
    }

    public void print_intro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello from My Vet Clinic!\nEnter the attending vet name: ");
        attending_name = sc.nextLine();
        System.out.println(" ");
        System.out.println("Dr. " + attending_name);

        System.out.println("Enter date in format YY-MM-DD: ");
        date = sc.nextLine();

        System.out.println(
                "\nYour patient's name is " + name +
                 "\nYour patient is a " + species
                + "\nYour patient weights " + weight + " pounds"
                + "\nYour patient is " + age + " years old"
                );

        System.out.println("Chose treatment: ");
        System.out.println(" ");
        System.out.println("1) Pain Killer\n2) Sedative\n3) Both Pain Killer and Sedative\n4) Other treatment");

        System.out.println("Enter treatment option: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                dosage = carprofen();
                System.out.println("Treatment: Carprofen: Dosage: " + dosage + " mg");
                treatment = "Carprofen dosage ";
                break;
            case 2:
                dosage = acepromazine();
                System.out.println("Treatment: Acepromazine: Dosage: " + dosage + " mg");
                treatment = "Acepromazine dosage ";
                break;
            case 3:
                dosage = acepromazine() + carprofen();
                System.out.println("Treatment: Both: Dosage: " + dosage + " mg");
                treatment = "Carprofen and Acepromazine dosage ";
                break;
            case 4:
                other_treatment();
                treatment = "Other treatment";
                break;
            default:
                System.out.println("Invalid option.");
                break;

        }
    }

    public String print_info() {
        String info = "Name: " + name
                + "\nSpecies: " + species
                + "\nWeight (pounds): " + weight
                + "\nAge (years): " + age
                + "\nHealth: " + health

                + "\n\nTreatment\nDate\t\t\tVet\t\t\t\t\tTreatment\n"
                + date + "\t\t" + attending_name + "\t\t" + treatment;

        if (treatment.equals("Other treatment")) {
            info += " ";
        }
        else {
            info = info + dosage;
        }

        info = info + "\n\n------------------------------------------------------\n\n";

        return info;
    }



    public void writeFile () {
        try {
            FileWriter fw = new FileWriter("output.txt", true);
            fw.write(print_info());
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAttending_name() {
        return attending_name;
    }

    public void setAttending_name(String attending_name) {
        this.attending_name = attending_name;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

}
