public class AssignmentSolution {
    public static void main(String[] args) {
        // overloading
        DataProcessor dp = new DataProcessor();
        System.out.println("[Output for method overloading - Integer]");
        dp.processData(42);
        System.out.println("[Output for method overloading - String (and its chained call)]");
        dp.processData("Punya");

        // overriding
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        System.out.println("[Output for method overriding - Parent class]");
        animal.makeSound();
        System.out.println("[Output for method overriding - Child class]");
        dog.makeSound();
        cat.makeSound();
    }

}

// this is overloading method
class DataProcessor{
    public void processData(int num){
        System.out.println("Processing data: " + num);
    }
    public void processData(String data){
        System.out.println("Processing data: " + data);
        processData(data.length());
    }
}

// this is overriding method
class Animal {
    public void makeSound() {
        System.out.println("yoo! wassupppp");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
}
