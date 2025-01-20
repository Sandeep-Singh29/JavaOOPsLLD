package inheritance;

public class TestAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Dog dog = new Dog();
        dog.sound();;
        Cat cat = new Cat();
        cat.sound();
        Animal animal1 = new Dog();
        animal1.sound();


    }
}
