import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.print("what animal do you have: ");
        char option = scanner.nextLine().toLowerCase().charAt(0);
        if (option == 'd') {
            animal = new Dog();
        }
        else if (option == 'c') {
            animal = new Cat();
        }
        else {
            animal = new Animal();
        }
        animal.display();


    }
}
