public class Animal implements talking{
    private String name;
    private String kind;

    Animal(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    Animal() {
        this.name = "animalName";
        this.kind = "animalKind";
    }

    public void speek(String message) {
        System.out.println(this.name + " says " + message);
    }
    public void talk(Animal anotherAnimal) {
        System.out.println(this.name + " is talking to " + anotherAnimal.name);
    }


}
