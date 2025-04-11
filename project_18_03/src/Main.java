import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Pet cat = new Cat(1,3, "Moonshine", "cat", 5, false, "brown");
        Pet dog = new Dog(2,12, "Lucky", "dog", 15, false, "stray");
        Pet parrot = new Parrot(3,30, "Richy", "parrot", 0.5, true, "long");
        Pet turtle = new Turtle(4,150, "Stepa", "turtle", 23, true, "land turtle");

        cat.print_intro();
        cat.writeFile();



    }
}